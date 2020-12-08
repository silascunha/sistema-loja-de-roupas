/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;


import br.sistemalojaroupas.model.dao.SaleDao;
import br.sistemalojaroupas.model.entities.Brand;
import br.sistemalojaroupas.model.entities.Category;
import br.sistemalojaroupas.model.entities.Color;
import br.sistemalojaroupas.model.entities.Customer;
import br.sistemalojaroupas.model.entities.Product;
import br.sistemalojaroupas.model.entities.Sale;
import br.sistemalojaroupas.model.entities.SaleItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author silas
 */
public class SaleDemo {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Category cat = new Category("Categoria teste");
        Color color = new Color("Cor teste");
        Customer customer = new Customer("999.888.777-55", "Cliente TESTE", "cliente@demonstracao.com", "88888888888");
        
        Product p1 = new Product("Produto teste 1", cat, "N/A", color, 27.50, 35.50, 35);
        p1.setId(60L);
        Product p2 = new Product("Produto teste 2", cat, "N/A", color, 27.50, 47.90, 15);
        p2.setId(61L);
        Product p3 = new Product("Produto teste 3", cat, "N/A", color, 27.50, 59.95, 50);
        p3.setId(62L);
        
        Sale sale = new Sale();
        sale.setMoment(sdf.parse("28/02/2019 17:51:23"));
        sale.addItem(new SaleItem(p3, 1));
        sale.setCustomer(customer);
        sale.setPayment(1);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("12/05/2019 12:31:30"));
        sale.addItem(new SaleItem(p1, 4));
        sale.setCustomer(customer);
        sale.setPayment(1);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("23/12/2019 14:47:15"));
        sale.addItem(new SaleItem(p2, 3));
        sale.setCustomer(customer);
        sale.setPayment(1);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("05/03/2019 18:06:40"));
        sale.addItem(new SaleItem(p2, 1));
        sale.setCustomer(customer);
        sale.setPayment(1);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("17/08/2020 09:30:00"));
        sale.addItem(new SaleItem(p3, 2));
        sale.setCustomer(customer);
        sale.setPayment(1);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("25/11/2020 09:42:37"));
        sale.addItem(new SaleItem(p1, 2));
        sale.setPayment(1);
        sale.setCustomer(customer);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("09/09/2019 10:28:25"));
        sale.addItem(new SaleItem(p1, 3));
        sale.setCustomer(customer);
        sale.setPayment(1);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("10/09/2020 15:10:05"));
        sale.addItem(new SaleItem(p2, 2));
        sale.setCustomer(customer);
        sale.setPayment(3);
        SaleDao.insert(sale);
        
        sale = new Sale();
        sale.setMoment(sdf.parse("29/04/2019 15:33:50"));
        sale.addItem(new SaleItem(p1, 1));
        sale.setCustomer(customer);
        sale.setPayment(3);
        SaleDao.insert(sale);
    }
    
}
