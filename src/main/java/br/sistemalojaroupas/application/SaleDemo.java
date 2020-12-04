/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;


import br.sistemalojaroupas.model.dao.SaleDao;
import br.sistemalojaroupas.model.entities.Sale;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author silas
 */
public class SaleDemo {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Sale sale = new Sale();
        sale.setMoment(sdf.parse("28/02/2019"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("12/05/2019"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("23/12/2019"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("05/03/2019"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("17/08/2020"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("25/11/2020"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("09/09/2019"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("10/09/2020"));
        SaleDao.insert(sale);
        sale = new Sale();
        sale.setMoment(sdf.parse("29/04/2019"));
        SaleDao.insert(sale);
    }
    
}
