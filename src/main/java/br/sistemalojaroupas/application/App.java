/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;


public class App {
    
    public static void main(String[] args) {
        int n4 = multiplicar(2, 3);
        int n3 = multiplicar(1, 3);
        
        System.out.println(n4);
        System.out.println(n3);
    }
    
    public static int multiplicar(int n1, int n2) {
        int soma = n1 * n2;
        
        return soma;
    }
}
