/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Category;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;

/**
 *
 * @author Marquinhos
 */
public class CategoryDao {
    private static ObjectRepository<Category> repCategory;
    
    public static void start() {
        repCategory = DB.getDB().getRepository(Category.class);
    }
    
    public static void insert(Category c) {
        repCategory.insert(c);
    }
   
    public static void update(Category c) {
        repCategory.update(c);
    }
    
    public static List<Category> findAll() {
        FindOptions fo = FindOptions.sort("category", SortOrder.Ascending);
        List<Category> list = repCategory.find(fo).toList();
        return list;
    }
    
    public static Category findById(NitriteId id) {
        Category c = repCategory.getById(id);
        return c;
    }
    
    public static void remove(Category c) {
        repCategory.remove(c);
    }
}
