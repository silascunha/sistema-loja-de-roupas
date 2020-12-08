/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class Sale implements Serializable, TableContract {
    private final static long serialVersionUID = 1L;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    @Id
    private Long id;
    
    private Set<SaleItem> items = new HashSet<>();
    
    private Employee employee;
    private Customer customer;
    private Integer payment;
    private Integer installments;
    
    public static final int MONEY = 1;
    public static final int CREDIT = 2;
    public static final int DEBIT = 3;
    public static final int MONEY_CREDIT = 4;
    
    private Date moment;
    
    public Sale() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<SaleItem> getItems() {
        return items;
    }
    
    public Date getMoment() {
        return moment;
    }
    
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    
    public void addItem(SaleItem item) {
        items.add(item);
    }
    
    public void removeItem(SaleItem item) {
        items.remove(item);
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public String getEmployeeName() {
        if (employee == null) {
            return "N/A";
        }
        else {
            return employee.getName();
        }
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public String getCustomerName() {
        if (customer == null) {
            return "N/A";
        }
        else {
            return customer.getName();
        }
    }
    
    public String getCustomerCpf() {
        if (customer == null) {
            return "N/A";
        }
        else {
            return customer.getCpf();
        }
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getPaymentName() {
        if (payment == null) {
            throw new IllegalStateException("O método de pagamento não pode ser nulo.");
        }
        if (payment == MONEY) {
            return "DINHEIRO";
        }
        if (payment == CREDIT) {
            return "CRÉDITO";
        }
        if (payment == DEBIT) {
            return "DÉBITO";
        }
        if (payment == MONEY_CREDIT) {
            return "DINHEIRO + CRÉDITO";
        }
        return "N/A";
    }

    public Integer getPayment() {
        return payment;
    }

    /**
     * Método de pagamento como um int.
     * <p>É recomendado usar: 
     * <p>Sale.MONEY
     * <p>Sale.CREDIT
     * <p>Sale.DEBIT
     * <p>Sale.MONEY_CREDIT
     * 
     * @param payment não pode ser nulo
     * @param installments pode ser nulo
     */
    public void setPayment(int payment) {
        if (payment > 4 || payment < 1) {
            throw new IllegalArgumentException("Opção inválida");
        }
        
        this.payment = payment;
       
    }

    public Object getInstallments() {
        if (installments == null) {
            return "N/A";
        }
        return installments;
    }

    public void setInstallments(Integer installments) {
        if (payment == null) {
            throw new IllegalStateException("O método de pagamento ainda não foi definido.");
        }
        if (payment == Sale.CREDIT || payment == Sale.MONEY_CREDIT){
            this.installments = installments;
        }
    }
    
    public String getFormattedDate() {
        return sdf.format(moment);
    }
    
    public Double getTotal() {
        double sum = 0.0;
        
        for (SaleItem element : items) {
            sum += element.getSubTotal();
        }
        return sum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Sale other = (Sale) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", items=" + items + ", moment=" + moment + "total=" + getTotal() +'}';
    }

    @Override
    public Object[] tableRowModel() {
        return new Object[]{
            getId(),
            String.format("%.2f", getTotal()),
            getFormattedDate(),
            (customer == null) ? "N/A" : getCustomer().getName(),
            (customer == null) ? "N/A" : getCustomer().getCpf()
        };
    }
    
}
