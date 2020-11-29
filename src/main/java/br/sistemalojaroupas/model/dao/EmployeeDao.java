/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.Employee;
import java.util.List;
import java.util.stream.Collectors;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.exceptions.NitriteException;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class EmployeeDao {
    
    private static ObjectRepository<Employee> repEmployee;
    
    static {
        repEmployee = DB.getDB().getRepository(Employee.class);
    }
    
    public static void insert(Employee emp) {
        try {
            repEmployee.insert(emp);
        } catch (NitriteException e) {
            throw new DBException("Já existe um funcionário com este CPF no sistema.");
        }
    }
    
    public static void update(Employee employee) {
        
        Employee temp = repEmployee.find(ObjectFilters.eq("cpf", employee.getName()))
                .firstOrDefault();
        
        if (employee.equals(temp) || temp == null) {
            repEmployee.update(employee);          
        }
        else {
            throw new DBException("Já existe um funcionário com este CPF no sistema.");
        }
    }
    
    public static List<Employee> findAll() {
        FindOptions fo = FindOptions.sort("name", SortOrder.Ascending);
        List<Employee> list = repEmployee.find(fo).toList();
        
        return list;
    }
    
    public static Employee findByCpf(String cpf) {
        Employee emp = repEmployee.find(ObjectFilters.eq("cpf", cpf)).firstOrDefault();
        return emp;
    }
    
    public static void remove(Employee emp) {
        repEmployee.remove(emp);
    }
    
    public static void removeByCpf(String cpf) {
        Employee emp = findByCpf(cpf);
        if (emp == null) throw new DBException("Erro na remoção: não existe um funcionário com esse cpf.");
        remove(emp);
    }
}
