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
public class Client implements Serializable, TableContract {

    @Id
    private String cpf;
    private String nome;
    private String email;
    private String celular;

    public Client() {

    }

    public Client(String cpf, String nome, String email, String celular) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", celular=" + celular + '}';
    }

    @Override
    public Object[] tableRowModel() {
        return new Object[]{
            getNome(),
            getCpf(),
            getCelular(),
            getEmail()
        };
    }

}


