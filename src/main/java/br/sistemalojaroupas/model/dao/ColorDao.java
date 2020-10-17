/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Color;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;

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
        repColor.insert(color);
    }
    
    public static void update(Color color) {
        repColor.update(color);
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
}
