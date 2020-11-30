/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.model.dao.UserDao;
import br.sistemalojaroupas.model.entities.User;


/**
 *
 * @author silas
 */
public class Teste {
    public static void main(String[] args) {
        String cpf = "123.456.789-00";
        String[] dividedCpf = cpf.replace('.', ',').replace('-', ',').split(",");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < dividedCpf.length; i++) {
            sb.append(dividedCpf[i]);
        }
        System.out.println(sb.toString().substring(0, 6));
    }
}
