/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
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
    
    private Employee employee;
    private Map<String, Boolean> permissions;

    public User() {
        permissions = new HashMap<>();
        permissions.put("product", true);
        permissions.put("employee", true);
        permissions.put("customer", true);
        permissions.put("sale", true);
        permissions.put("homeinfo", true);
    }

    public User(String userName, String password, int authentication) {
        this.userName = userName;
        this.password = password;
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
    
    public String getEmployeeName() {
        if(employee != null) {
            return employee.getName();
        }
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Map<String, Boolean> getPermissions() {
        if (employee == null) {
            return permissions;
        }
        else {
            return employee.getOffice().getPermissions();
        }
    }

    public void setPermissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
    }
    
    public Boolean hasPermission(String key) {
        return getPermissions().get(key);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName=" + userName + ", password=" + password + ", employee=" + employee + '}';
    }
}
