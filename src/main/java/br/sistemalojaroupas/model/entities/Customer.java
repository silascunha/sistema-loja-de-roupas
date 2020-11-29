/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.util.Objects;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author vfdes
 */
public class Customer implements Serializable, TableContract {

    @Id
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
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cpf);
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
        if (!Objects.equals(this.cpf, other.cpf)) {
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


