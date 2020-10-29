/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import org.dizitart.no2.IndexType;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;
import org.dizitart.no2.objects.Index;
import org.dizitart.no2.objects.Indices;

/**
 *
 * @author Marguins
 */
@Indices(
        @Index(value = "userName", type = IndexType.Unique)
)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private NitriteId id;
    private String userName;
    private String password;
    private int authentication;

    public User(String userName, String password, int authentication) {
        this.userName = userName;
        this.password = password;
        this.authentication = authentication;
    }

    public NitriteId getId() {
        return id;
    }

    public void setId(NitriteId id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthentication() {
        return authentication;
    }

    public void setAuthentication(int authentication) {
        this.authentication = authentication;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName=" + userName + ", password=" + password + ", authentication=" + authentication + '}';
    }
    
    
}
