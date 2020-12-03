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
 * @author vfdes
 */
@Indices(
    @Index(value = "cpf", type = IndexType.Unique)
)
public class Customer implements Serializable, TableContract {

    @Id
    private NitriteId id;
    private String cpf;
    private String name;
    private String email;
    private String phone;

    public Customer() {

    }

    public Customer(String cpf, String name, String email, String celular) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phone = celular;
    }

    public NitriteId getId() {
        return id;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "cpf=" + cpf + ", nome=" + name + ", email=" + email + ", celular=" + phone + '}';
    }

    @Override
    public Object[] tableRowModel() {
        return new Object[]{
            getName(),
            getCpf(),
            getPhone(),
            getEmail()
        };
    }

}


