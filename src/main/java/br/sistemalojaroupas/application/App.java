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
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.filters.ObjectFilters;


public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        ProductDao.start();

        System.out.println();

        //TESTE DE INSERÇÃO
        /*
        Product product = new Product("Short do Flamengo Bordado", "P", "Branco", 40.0, 2);
        ProductDao.insert(product);
        System.out.println("Produto inserido! Novo ID: " + product.getId());
        */
        
        //TESTE DE LISTAGEM DOS PRODUTOS
        System.out.println("LISTA DE PRODUTOS REGISTRADOS:");
        List<Product> list = ProductDao.findAll();

        for(Product p : list) {
            System.out.println(p);
        }
        
        DB.close();
    }
}
