
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.Employee;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

public class EmployeeDao {
    
    public static ObjectRepository<Employee> repEmployee;
    
    static {
        repEmployee = DB.getDB().getRepository(Employee.class);
    }
    
    public static void insert(Employee cf) {
        repEmployee.insert(cf);
    }
   
    public static void update(Employee cf) {
                Employee temp = repEmployee.find(ObjectFilters.eq("cpf", cf.getCpf()))
                .firstOrDefault();
        
        if (cf.equals(temp) || temp == null) {
            repEmployee.update(cf);
        }
        else {
            throw new DBException("Este CPF já está cadastrado.");
        }
    }
    
    public static List<Employee> findAll() {
        FindOptions fo = FindOptions.sort("nome", SortOrder.Ascending);
        List<Employee> list = repEmployee.find(fo).toList();
        return list;
    }
    
    public static Employee findById(NitriteId id) {
        Employee cf = repEmployee.getById(id);
        return cf;
    }
    
    public static void remove(Employee cf) {
        repEmployee.remove(cf);
    }

}