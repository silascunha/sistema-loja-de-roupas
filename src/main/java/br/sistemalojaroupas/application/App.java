/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.EmployeeDao;
import br.sistemalojaroupas.model.entities.Employee;
import br.sistemalojaroupas.model.services.CepService;
import br.sistemalojaroupas.view.Home;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {
    
    /* Apenas realizando testes do banco de dados na classe 
    enquanto não há interação com a interface grafica */
    
    public static void main(String[] args) throws ParseException {
        new Home().main(args);
    }
    
}
