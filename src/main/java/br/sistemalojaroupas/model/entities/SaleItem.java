/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.util.Objects;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class SaleItem implements Serializable, TableContract {
    private final static long serialVersionUID = 1L;
    
    @Id
    private NitriteId id;
    
    private Product product;
    private int quantity;
    
    public SaleItem() {
        
    }

    public SaleItem(Product product, int quantity) {
        if (quantity > product.getQuantity()) throw new IllegalArgumentException("A quantidade excede a do produto em estoque.");
            
        this.product = product;
        this.quantity = quantity;
        
    }

    public NitriteId getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public Double getSubTotal() {
        return this.product.getSalePrice() * quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.product);
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
        final SaleItem other = (SaleItem) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaleItem{" + "id=" + product.getId() + ", product=" + product + ", quantity=" + quantity + '}';
    }

    @Override
    public Object[] tableRowModel() {
        return new Object[] {
            product.getId(),
            product.getDescription(),
            product.getBrand(),
            product.getSize(),
            product.getColor().getName(),
            String.format("%.2f", product.getSalePrice()),
            getQuantity(),
            String.format("%.2f", getSubTotal())
        };
    }
    
}
