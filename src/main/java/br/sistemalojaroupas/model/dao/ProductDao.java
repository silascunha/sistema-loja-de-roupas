/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Category;
import br.sistemalojaroupas.model.entities.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class ProductDao {
    
    private static ObjectRepository<Product> repProduct;
    
    static {
        repProduct = DB.getDB().getRepository(Product.class);
    }
    
    public static ObjectRepository<Product> getProductRepository() {
        return repProduct;
    }
    
    public static void insert(Product p) {
        repProduct.insert(p);
    }
   
    public static void update(Product p) {
        repProduct.update(p);
    }
    
    public static List<Product> search(String arg0) {
        String str = arg0.toUpperCase();
        List<Product> list = repProduct.find(ObjectFilters.regex("description", str),
                FindOptions.sort("description", SortOrder.Ascending))
                .toList();
        return list;
    }
    
    public static List<Product> findAll() {
        FindOptions fo = FindOptions.sort("description", SortOrder.Ascending);
        List<Product> list = repProduct.find(fo).toList();
        
        return list;
    }
    
    public static Product findById(NitriteId id) {
        Product p = repProduct.getById(id);
        return p;
    }
    
    public static void remove(Product p) {
        repProduct.remove(p);
    }
    
    public static void removeById(NitriteId id) {
        Product p = findById(id);
        remove(p);
    }
}
