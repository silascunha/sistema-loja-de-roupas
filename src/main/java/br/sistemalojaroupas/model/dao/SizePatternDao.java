/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.SizePattern;
import java.util.Arrays;
import java.util.List;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class SizePatternDao {
    
    private static ObjectRepository<SizePattern> repSizePattern;
    
    static {
        repSizePattern = DB.getDB().getRepository(SizePattern.class);
        
        if (repSizePattern.size() == 0) {
            SizePattern sp1 = new SizePattern("N1");
            List<String> sizeList = Arrays.asList("34", "36", "38", "40", "42",
                    "44", "46", "48", "50", "52", "54");
            sp1.getSizes().addAll(sizeList);
            
            SizePattern sp2 = new SizePattern("N2");
            sizeList = Arrays.asList("PP", "P", "M", "G", "GG", "XG", "XGG", "EG",
                    "EGG");
            sp2.getSizes().addAll(sizeList);
            repSizePattern.insert(sp1, sp2);
        }
    }
    
    public static List<SizePattern> findAll() {
        List<SizePattern> list = repSizePattern.find().toList();
        return list;
    }
    
    public static SizePattern findById(NitriteId id) {
        SizePattern sp = repSizePattern.getById(id);
        return sp;
    }
    
    public static SizePattern findByName(String name) {
        SizePattern sp = repSizePattern.find(ObjectFilters.eq("name", name))
                .firstOrDefault();
        
        if (sp == null) {
            throw new DBException("Não existe um padrão salvo com esse nome.");
        }
        return sp;
    }
    
    public static void insert(SizePattern sp) {
        repSizePattern.insert(sp);
    }
    
    public static void update(SizePattern sp) {
        SizePattern temp = repSizePattern.find(ObjectFilters.eq("name", sp.getName()))
                .firstOrDefault();
        
        if (sp.equals(temp) || temp == null) {
            repSizePattern.update(sp);
            
        }
        else {
            throw new DBException("Já existe um padrão com esse nome no sistema.");
        }
    }
    
    public static void remove(SizePattern sp) {
        repSizePattern.remove(sp);
    }
}
