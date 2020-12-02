/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Sale;
import br.sistemalojaroupas.model.entities.util.CodeGenerator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class SaleDao {
    
    private static ObjectRepository<Sale> repSale;
    private static ObjectRepository<CodeGenerator> repCode;
    private static CodeGenerator codeGenerator;
    
    static {
        repCode = DB.getDB().getRepository(CodeGenerator.class);
        
        if (!DB.getDB().hasRepository(Sale.class)) {
            codeGenerator = new CodeGenerator(Sale.class.getSimpleName(), 0L);
            repCode.insert(codeGenerator);
        }
        else {
            codeGenerator = repCode.find(ObjectFilters
                    .eq("classType", Sale.class.getSimpleName()))
                    .firstOrDefault();
        }
        repSale = DB.getDB().getRepository(Sale.class);
    }
    
    public static void insert(Sale sale) {
        codeGenerator.setLastCode(codeGenerator.getLastCode() + 1);
        
        sale.setId(codeGenerator.getLastCode());
        
        repSale.insert(sale);
        repCode.update(codeGenerator);
    }
    
    public static List<Sale> findAll() {
        List<Sale> list = repSale.find(FindOptions.sort("moment", SortOrder.Descending))
                .toList();
        
        return list;
    }
    
    public static Sale findById(Long id) {
        Sale sale = repSale.find(ObjectFilters.eq("id", id)).firstOrDefault();
        return sale;
    }
    
    public static void update(Sale sale) {
        repSale.update(sale);
    }
    
    public static void remove(Sale sale) {
        repSale.remove(sale);
    }
    
    public static void removeById(Long id) {
        Sale sale = findById(id);
        repSale.remove(sale);
    }
    
    public static Long size() {
        return repSale.size();
    }
    
    public static Double revenues() {
        Double revenues = 0.0;
        
        for (Sale obj : findAll()) {
            revenues += obj.getTotal();
        }
        
        return revenues;
    }
    
    public static List<Sale> filterByPeriod(String startPeriod, String endPeriod) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        Date start = sdf.parse(startPeriod + " 24:00:00");
        Date end = sdf.parse(endPeriod + " 23:59:59");
        
        List<Sale> sales = repSale.find(ObjectFilters.and(ObjectFilters.gte("moment", start),
                ObjectFilters.lte("moment", end)),
                FindOptions.sort("moment", SortOrder.Descending)).toList();
        
        return sales;
    }
}
