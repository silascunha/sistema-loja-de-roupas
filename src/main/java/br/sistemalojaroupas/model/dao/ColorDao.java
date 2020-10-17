/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.db.DBException;
import br.sistemalojaroupas.model.entities.Color;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.exceptions.NitriteException;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author silas
 */
public class ColorDao {
    
    private static ObjectRepository<Color> repColor;
    
    static {
        repColor = DB.getDB().getRepository(Color.class);
    }
    
    public static void insert(Color color) {
        try {
            repColor.insert(color);
        } catch (NitriteException e) {
            throw new DBException(e.getMessage());
        }
    }
    
    public static void update(Color color) {
        Color temp = repColor.find(ObjectFilters.eq("name", color.getName()))
                .firstOrDefault();
        
        if (color.equals(temp) || temp == null) {
            repColor.update(color);
        }
        else {
            throw new DBException("A cor digitada já existe.");
        }
    }
    
    public static List<Color> findAll() {
        List<Color> list = repColor.find(FindOptions
                .sort("name", SortOrder.Ascending)).toList();
        return list;
    }
    
    public static Color findById(NitriteId id) {
        Color c = repColor.getById(id);
        return c;
    }
    
    public static void remove(Color color) {
        repColor.remove(color);
    }
    
    public static void removeById(NitriteId id) {
        Color color = findById(id);
        remove(color);
    }
}
