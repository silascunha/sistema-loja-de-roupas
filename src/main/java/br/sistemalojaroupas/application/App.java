/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.ColorDao;
import br.sistemalojaroupas.model.dao.EmployeeDao;
import br.sistemalojaroupas.model.dao.ProductDao;
import br.sistemalojaroupas.model.dao.UserDao;
import br.sistemalojaroupas.model.entities.Color;
import br.sistemalojaroupas.model.entities.User;
import br.sistemalojaroupas.view.Home;
import javax.swing.JOptionPane;
import org.dizitart.no2.NitriteId;



public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        if(UserDao.verify("Jorg", "123") == true){
            JOptionPane.showMessageDialog(null, "Bem vindo!");
        }
        
       
        //System.out.println(u);
        //new Home().main(args);
    }
}
