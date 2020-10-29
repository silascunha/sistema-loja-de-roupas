/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.User;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author Marguins
 */
public class UserDao {
    public static ObjectRepository<User> repUser;
    
    static {
        repUser = DB.getDB().getRepository(User.class);
    }
    
    public static ObjectRepository<User> getProductRepository() {
        return repUser;
    }
    
    public static void verify(String userName, String password){
        
    }
    
    public static void insert(User u) {
        repUser.insert(u);
    }
    
    public static void update(User u ) {
                User temp = repUser.find(ObjectFilters.eq("userName", u.getUserName()))
                .firstOrDefault();
        
        if (u.equals(temp) || temp == null) {
            repUser.update(u);
        }
        else {
            throw new DBException("Nome de usuário já cadastrado.");
        }
    }
    
    public static List<User> findAll() {
        FindOptions fo = FindOptions.sort("userName", SortOrder.Ascending);
        List<User> list = repUser.find(fo).toList();
        return list;
    }
    
    public static User findById(NitriteId id) {
        User u = repUser.getById(id);
        return u;
    }

    public static User findByUser(String userName) {
        User u = repUser.find(ObjectFilters.eq(userName, repUser)).firstOrDefault();
        return u;
    }
    
    public static void remove(User u) {
        repUser.remove(u);
    }
}
