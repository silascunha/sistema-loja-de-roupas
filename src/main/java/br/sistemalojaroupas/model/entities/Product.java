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
public class Product implements Serializable {
    private static long serialVersionUID = 1L;
    
    @Id
    private NitriteId id;
    private String description;
    private Category category;
    private String size;
    private Color color;
    private Double price;
    private int quantity;
    
    public Product() {}
    
    public Product(String description, Category category, String size, Color color, Double price, int quantity) {
        this.description = description;
        this.category = category;
        this.size = size;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public NitriteId getId() {
        return id;
    }

    public void setId(NitriteId id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color  color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description 
                + ", category=" + category
                + ", size=" + size 
                + ", color=" + color + ", price=" 
                + price + ", quantity=" 
                + quantity + '}';
    }

}