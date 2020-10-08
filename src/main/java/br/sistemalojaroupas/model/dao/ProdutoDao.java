/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Produto;
import org.dizitart.no2.objects.ObjectRepository;

/**
 *
 * @author silas
 */
public class ProdutoDao {
    
    private static ObjectRepository<Produto> repProduto;
    
    public static void iniciar() {
        repProduto = DB.getDB().getRepository(Produto.class);
    }
    
}
