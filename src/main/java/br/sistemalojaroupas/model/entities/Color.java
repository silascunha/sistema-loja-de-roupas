/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class Color implements Serializable {
    //requerimento da interface Serializable
    private final static long serialVersionUID = 1L;
    
    @Id
    private NitriteId id;
    private String name;

    public Color() {
    }

    public Color(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return "Color{" + "id=" + id + ", name=" + name + '}';
    }
}
