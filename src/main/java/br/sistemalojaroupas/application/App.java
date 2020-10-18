/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.CategoryDao;
import br.sistemalojaroupas.model.dao.ColorDao;
import br.sistemalojaroupas.model.dao.ProductDao;
import br.sistemalojaroupas.model.entities.Category;
import br.sistemalojaroupas.model.entities.Color;
import br.sistemalojaroupas.model.entities.Product;
import java.util.List;
import java.util.Scanner;


public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        DB.start();
        
        
        DB.close();
    }
}
