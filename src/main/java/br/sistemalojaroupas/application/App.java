/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.User;
import br.sistemalojaroupas.model.dao.UserDao;





public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        
//        User u1 = new User("marcos", "123", 1);
//        User u2 = new User("jorge", "321", 0);
//        
//        UserDao.insert(u1);
//        UserDao.insert(u2);
        
        System.out.println(UserDao.findAll());
//        if(UserDao.verify("admin", "12345")){
//            JOptionPane.showMessageDialog(null, "Bem vindo!");
//        }
//        else {
//            JOptionPane.showMessageDialog(null, "Nome ou senha incorretos.", "Teste", JOptionPane.INFORMATION_MESSAGE);
//        }
        
    }
    
}
