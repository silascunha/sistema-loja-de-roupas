/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.UserDao;
import br.sistemalojaroupas.model.entities.User;
import javax.swing.JOptionPane;




public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        if(UserDao.verify("admi", "12345")){
            JOptionPane.showMessageDialog(null, "Bem vindo!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nome ou senha incorretos.", "Teste", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
