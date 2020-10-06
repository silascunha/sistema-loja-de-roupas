/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.db;

import org.dizitart.no2.Nitrite;

/**
 *
 * @author silas
 */
public class DB {
    
    private static Nitrite db = null;
    
    public static void start() {
        db = Nitrite.builder()
                .compressed()
                .filePath("dataBase.db")
                .openOrCreate("coldy", "73313391");
    }
    
    public static Nitrite getDB() {
        if (db == null) {
            start();
        }
        return db;
    }
    
    public static void close() {
        if (db != null) {
            db.close();
        }
    }
    
    public static boolean isClosed() {
        return db.isClosed();
    }
}
