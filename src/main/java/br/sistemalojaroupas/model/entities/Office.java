/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.dizitart.no2.IndexType;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;
import org.dizitart.no2.objects.Index;
import org.dizitart.no2.objects.Indices;

/**
 *
 * @author silas
 */
@Indices(
        @Index(value = "name", type = IndexType.Unique)
)
public class Office {
    
    @Id
    private NitriteId id;
    private String name;
    
    private Map<String, Boolean> permissions;
    
    public Office() {
        permissions = new HashMap<>();
        permissions.put("product", false);
        permissions.put("employee", false);
        permissions.put("customer", false);
        permissions.put("sale", false);
        permissions.put("homeinfo", false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Boolean> getPermissions() {
        return permissions;
    }
    
    public void putPermission(String key, Boolean value) {
        permissions.replace(key, value);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Office other = (Office) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
    
}
