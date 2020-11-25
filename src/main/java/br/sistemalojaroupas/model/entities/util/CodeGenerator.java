/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities.util;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Product;
import java.io.Serializable;
import java.util.Objects;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 * @param <T>
 */

public class CodeGenerator implements Serializable {
    private final static long serialVersionUID = 1L;
    
    @Id
    private String classType;

    private Long lastCode;
    
    public CodeGenerator() {}
    
    public CodeGenerator(String classType, Long lastCode) {
        this.classType = classType;
        this.lastCode = lastCode;
    }

    public String getClassType() {
        return classType;
    }
    
    public Class getObjClass() {
        return this.getClass();
    }

    public Long getLastCode() {
        return lastCode;
    }

    public void setLastCode(Long lastCode) {
        this.lastCode = lastCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.classType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CodeGenerator other = (CodeGenerator) obj;
        if (!Objects.equals(this.classType, other.classType)) {
            return false;
        }
        return true;
    }

}
