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
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class Employee implements Serializable, TableContract {
    
    @Id 
    private String cpf;
    private String name;
    private String email;
    private String phone;
    private String occupation;
    private Date birthDate;
    private Date admissionDate;
    private Double salary;
    
    private Address address;
    
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.cpf);
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
        if (!Objects.equals(this.cpf, other.cpf)) {
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
