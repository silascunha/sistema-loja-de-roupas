/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.SizePattern;
import br.sistemalojaroupas.view.Home;



public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        
       
        new Home().main(args);
    }
    
//    public static void main(String[] args) {
//        DB.start();
//        
//        SizePattern sp = new SizePattern(null, "N1");
//        sp.addNewSize("18");
//        sp.addNewSize("20");
//        sp.addNewSize("22");
//        
//        DB.close();
//    }
}
