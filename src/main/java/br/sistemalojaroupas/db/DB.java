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
    
    /**
     * Inicia a conexão com o banco de dados caso seja nulo. 
     * Não é possível iniciar a conexão mais de uma vez.
     */
    public static void start() {
        if (db == null) {
            db = Nitrite.builder()
                    .compressed()
                    .filePath("dataBase.db")
                    .openOrCreate("dev", "73313391");
        }
    }
    
    /**
     * Retorna o banco de dados Nitrite para utilizacao no DAO das entidades.
     * Caso o banco ainda não tenha tido sua conexão iniciada pelo método start(),
     * o banco é iniciado automaticamente.
     * @return O atributo Nitrite db com a conexão
     */
    public static Nitrite getDB() {
        if (db == null) {
            start();
        }
        return db;
    }
    
    /**
     * Realiza o fechamento da conexão com o banco de dados.
     * É importante utilizar este método quando não há mais uso do banco.
     */
    public static void close() {
        if (db != null) {
            db.close();
        }
    }
    
    /**
     * Verifica se o banco de dados está fechado.
     * @return Retorna true caso esteja fechado.
     */
    public static boolean isClosed() {
        if (db != null) return db.isClosed();
        return true;
    }
    
}
