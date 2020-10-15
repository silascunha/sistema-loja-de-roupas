/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.ProductDao;
import br.sistemalojaroupas.model.dao.CategoryDao;
import br.sistemalojaroupas.model.entities.Product;
import br.sistemalojaroupas.model.entities.Category;
import br.sistemalojaroupas.model.entities.Color;
import java.util.List;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.filters.ObjectFilters;


public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        ProductDao.start();
        CategoryDao.start();
        

        //TESTE DE INSERÇÃO
//        Category category = new Category("Vestido");
//        Color color = new Color("Branco");
//        Product product = new Product("Short do Flamengo Bordado", category,"P", color, 20.0 ,2);
//        ProductDao.insert(product);
//        System.out.println("Produto inserido! Novo ID: " + product.getId());
        
        
        //TESTE DE LISTAGEM DOS PRODUTOS
//        System.out.println("LISTA DE PRODUTOS REGISTRADOS:");
//        List<Product> list = ProductDao.findAll();
//
//        for(Product p : list) {
//            System.out.println(p);
//        }
        
//        TESTE DE ATUALIZAÇÃO DOS PRODUTOS
    
//        category =  new Category("Camisa");
//        color = new Color("Preto");
//        
//        product.setDescription("Lacoste");
//        product.setCategoria(category);
//        product.setSize("M");
//        product.setColor(color);
//        product.setPrice(40.0);
//        product.setQuantity(10);
//        ProductDao.update(product);
//            
//        System.out.println("Produto Atualizado! Novo produto: " +product);
        DB.close();
    }
}
