/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.dao.exceptions.LoginException;
import br.sistemalojaroupas.model.entities.Employee;
import br.sistemalojaroupas.model.entities.User;
import java.util.List;
import javax.swing.JOptionPane;
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
        if (!DB.getDB().hasRepository(User.class)) {
            repUser = DB.getDB().getRepository(User.class);
            
            User u = new User();
            u.setUserName("admin");
            u.setPassword("admin");
            
            repUser.insert(u);
        }
        repUser = DB.getDB().getRepository(User.class);
    }

    public static User verify(String userName, String password) {
        User u = UserDao.findByUser(userName);
        
        if (userName.equals("") || password.equals("")) throw new LoginException("Preencha todos os campos.");
        if (u == null) throw new LoginException("Usuário ou senha inválidos.");
        if (!u.getUserName().equals(userName) || !u.getPassword().equals(password)) {
            throw new LoginException("Usuário ou senha inválidos.");
        }
        return u;
    }

    public static void insert(User u) {
        repUser.insert(u);
    }

    public static void update(User u) {
        User temp = repUser.find(ObjectFilters.eq("userName", u.getUserName()))
                .firstOrDefault();

        if (u.equals(temp) || temp == null) {
            repUser.update(u);
        } else {
            throw new DBException("Nome de usuário já existe.");
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

    //procura o usuário com o userName
    public static User findByUser(String userName) {
        User u = repUser.find(ObjectFilters.eq("userName", userName)).firstOrDefault();

        return u;
    }
    
    public static User findByEmployee(Employee employee) {
        User user = repUser.find(ObjectFilters.eq("employee.id", employee.getId())).firstOrDefault();
        
        return user;
    }

    public static void remove(User u) {
        repUser.remove(u);
    }
}
