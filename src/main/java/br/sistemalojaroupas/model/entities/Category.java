/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.util.Objects;
import org.dizitart.no2.IndexType;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;
import org.dizitart.no2.objects.Index;
import org.dizitart.no2.objects.Indices;

/**
 *
 * @author Marquinhos
 */
@Indices(
    @Index(value = "category", type = IndexType.Unique)
)
public class Category implements Serializable{
    private static long serialVersionUID = 1L;
    
    @Id
    private NitriteId id;
    private String category;
    
    private SizePattern sizePattern;

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }
    
    public Category(String category, SizePattern sizePattern) {
        this(category);
        this.sizePattern = sizePattern;
    }

    public NitriteId getId() {
        return id;
    }

    public void setId(NitriteId id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SizePattern getSizePattern() {
        return sizePattern;
    }

    public void setSizePattern(SizePattern sizePattern) {
        this.sizePattern = sizePattern;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Category other = (Category) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return category;
    }
}
