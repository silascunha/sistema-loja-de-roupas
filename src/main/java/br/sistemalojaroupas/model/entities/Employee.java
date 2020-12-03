/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Index(value = "cpf", type = IndexType.Unique)
)
public class Employee implements Serializable, TableContract {
    
    @Id 
    private NitriteId id;
    private String cpf;
    private String name;
    private String email;
    private String phone;
    private Date birthDate;
    private Date admissionDate;
    private Double salary;
    
    private Address address;
    private Office office;
    
    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Employee() {
    }

    public Employee(String cpf, String name, String email, String phone, Date birthDate, Date admissionDate, Double salary, Address address) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.admissionDate = admissionDate;
        this.salary = salary;
        this.address = address;
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

    public Date getBirthDate() {
        return birthDate;
    }
    
    public String getFormattedBirthDate() {
        return sdf.format(birthDate);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }
    
    public String getFormattedAdmissionDate() {
        return sdf.format(admissionDate);
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "cpf=" + cpf + ", name=" + name + ", email=" + email + ", phone=" + phone + ", birthDate=" + birthDate + ", admissionDate=" + admissionDate + ", salary=" + salary + ", address=" + address + '}';
    }

    @Override
    public Object[] tableRowModel() {
        return new Object[] {
            getCpf(),
            getName()
        };
    }
    
}
