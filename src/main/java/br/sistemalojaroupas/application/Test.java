/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.model.dao.SaleDao;
import br.sistemalojaroupas.model.entities.Sale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



/**
 *
 * @author silas
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("29/11/2020");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        date = cal.getTime();
        System.out.println();
    }
    
    
}
