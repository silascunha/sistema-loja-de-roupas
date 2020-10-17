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
import java.util.Scanner;


public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        
        if (str.equals(str2)) {
            System.out.println("É igual");
        }
        else {
            System.out.println("Não é igual");
        }
        
        sc.close();
    }
}
