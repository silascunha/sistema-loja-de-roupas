/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.ProductDao;
import br.sistemalojaroupas.model.entities.Product;
import java.util.List;


public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        
        //Color color = new Color("Vermelha");
        //Category category = new Category("Camisas");
        
        //Product produto = new Product("Camisa Lacoste", category, "G", color, 45.0, 1);
        
        //ProductDao.insert(produto);
        
        List<Product> list = ProductDao.findAll();
        
        list.forEach(System.out::println);
        
        DB.close();
    }
}
