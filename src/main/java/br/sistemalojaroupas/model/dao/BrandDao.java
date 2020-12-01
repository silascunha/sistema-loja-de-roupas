/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.Brand;
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
public class BrandDao {
    
    private static ObjectRepository<Brand> repBrand;
    
    static {
        repBrand = DB.getDB().getRepository(Brand.class);
    }
    
    public static void insert(Brand brand) {
        try {
            repBrand.insert(brand);
        } catch (NitriteException e) {
            throw new DBException(e.getMessage());
        }
    }
    
    public static void update(Brand brand) {
        Brand temp = repBrand.find(ObjectFilters.eq("name", brand.getName()))
                .firstOrDefault();
        
        if (brand.equals(temp) || temp == null) {
            repBrand.update(brand);
            
            ProductDao.findAll().stream().filter(p -> p.getBrand().equals(brand))
                    .collect(Collectors.toList()).forEach(p -> {
                        p.setBrand(brand);
                        ProductDao.update(p);
                    });
            
        }
        else {
            throw new DBException("A marca digitada já existe.");
        }
    }
    
    public static List<Brand> search(String arg0) {
        List<Brand> list = repBrand.find(ObjectFilters.regex("name", arg0),
                FindOptions.sort("name", SortOrder.Ascending)).toList();
        
        return list;
    }
    
    public static List<Brand> findAll() {
        List<Brand> list = repBrand.find(FindOptions
                .sort("name", SortOrder.Ascending)).toList();
        return list;
    }
    
    public static Brand findById(NitriteId id) {
        Brand c = repBrand.getById(id);
        return c;
    }
    
    public static Brand findByName(String name) {
        Brand brand = repBrand.find(ObjectFilters.eq("name", name)).firstOrDefault();
        return brand;
    }
    
    public static void remove(Brand brand) {
        repBrand.remove(brand);
    }
    
    public static void removeById(NitriteId id) {
        Brand brand = findById(id);
        remove(brand);
    }
}
