/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Product;
import br.sistemalojaroupas.model.entities.util.CodeGenerator;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class ProductDao {
    
    private static ObjectRepository<Product> repProduct;
    private static ObjectRepository<CodeGenerator> repCode;
    private static CodeGenerator codeGenerator;
    
    static {
        repCode = DB.getDB().getRepository(CodeGenerator.class);
        
        if (!DB.getDB().hasRepository(Product.class)) {
            codeGenerator = new CodeGenerator(Product.class.getSimpleName(), 0L);
            repCode.insert(codeGenerator);
        }
        else {
            codeGenerator = repCode.find(ObjectFilters.eq("classType", Product.class.getSimpleName()))
                    .firstOrDefault();
        }
        repProduct = DB.getDB().getRepository(Product.class);
    }
    
    public static ObjectRepository<Product> getProductRepository() {
        return repProduct;
    }
    
    public static void insert(Product p) {
        
        codeGenerator.setLastCode(codeGenerator.getLastCode() + 1);
        
        p.setId(codeGenerator.getLastCode());
        
        repProduct.insert(p);
        repCode.update(codeGenerator);
    }
   
    public static void update(Product p) {
        repProduct.update(p);
    }
    
    public static List<Product> search(String arg0) {
        String str = arg0.toUpperCase();
        Long id;
        
        try {
            id = Long.parseLong(arg0);
        }
        catch(NumberFormatException e) {
            id = null;
        }
        
        List<Product> list = repProduct.find(ObjectFilters.or(
                ObjectFilters.regex("description", str),
                ObjectFilters.eq("id", id)),
                FindOptions.sort("description", SortOrder.Ascending))
                .toList();
        
        return list;
    }
    
    public static List<Product> findAll() {
        FindOptions fo = FindOptions.sort("description", SortOrder.Ascending);
        List<Product> list = repProduct.find(fo).toList();
        
        return list;
    }
    
    public static Product findById(Long id) { 
        Product p = repProduct.find(ObjectFilters.eq("id", id))
                .firstOrDefault();
        return p;
    }
    
    public static void remove(Product p) {
        repProduct.remove(p);
    }
    
    public static void removeById(Long id) {
        Product p = findById(id);
        remove(p);
    }
}
