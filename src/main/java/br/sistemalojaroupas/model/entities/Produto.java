/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class Produto {
    
    @Id
    private NitriteId id;
    private String modelo;
    private String tamanho;
    //private Marca marca;
    private String cor;
    private Double preco;
    
    
}
