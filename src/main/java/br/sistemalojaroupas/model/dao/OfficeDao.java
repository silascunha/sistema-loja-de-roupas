/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.Office;
import java.util.List;
import java.util.stream.Collectors;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.exceptions.NitriteException;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class OfficeDao {
    
    private static ObjectRepository<Office> repOffice;
    
    static {
        repOffice = DB.getDB().getRepository(Office.class);
    }
    
    public static void insert(Office office) {
        try {
            repOffice.insert(office);
        } catch (NitriteException e) {
            throw new DBException("Já existe um cargo com este nome.");
        }
    }
    
    public static void update(Office c) {
        Office temp = repOffice.find(ObjectFilters.eq("name", c.getName()))
                .firstOrDefault();
        
        if (c.equals(temp) || temp == null) {
            repOffice.update(c);
            
            EmployeeDao.findAll().stream().filter(x -> x.getOffice().equals(c))
                    .collect(Collectors.toList()).forEach(x -> {
                        x.setOffice(c);
                        EmployeeDao.update(x);
                    });
        }
        else {
            throw new DBException("Já existe um cargo com este nome.");
        }
    }
    
    public static List<Office> search(String arg0) {
        List<Office> list = repOffice.find(ObjectFilters.regex("name", arg0),
                FindOptions.sort("name", SortOrder.Ascending)).toList();
        
        return list;
    }
    
    public static List<Office> findAll() {
        List<Office> list = repOffice.find(FindOptions
                .sort("name", SortOrder.Ascending)).toList();
        return list;
    }
    
    public static Office findById(NitriteId id) {
        Office c = repOffice.getById(id);
        return c;
    }
    
    public static void remove(Office office) {
        repOffice.remove(office);
    }
    
    public static void removeById(NitriteId id) {
        Office office = findById(id);
        remove(office);
    }
}
