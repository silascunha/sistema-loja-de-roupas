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
public class Product implements Serializable, TableContract {
    private final static long serialVersionUID = 1L;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    @Id
    private Long id;
    private String description;
    private String size;
    private Double costPrice;
    private Double salePrice;
    private Date date = new Date();
    private int quantity;
    
    private Color color;
    private Category category;
    private Brand brand;
    
    public Product() {}

    public Product(String description, Category category, String size, Color color, Double costPrice, Double salePrice, int quantity) {
        this.description = description;
        this.category = category;
        this.size = size;
        this.color = color;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Date getDate() {
        return date;
    }
    
    public String getFormattedDate() {
        String formattedDate = sdf.format(this.date);
        return formattedDate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "id=" 
                + id 
                + ", description=" 
                + description 
                + ", category=" 
                + category 
                + ", size=" 
                + size 
                + ", brand=" 
                + brand
                + ", color=" 
                + color 
                + ", costPrice=" 
                + costPrice 
                + ", salePrice=" 
                + salePrice 
                + ", date=" 
                + date 
                + ", quantity=" 
                + quantity 
                + '}';
    }

    @Override
    public Object[] tableRowModel() {
        return new Object[] {
            getId(),
            getDescription(),
            getColor(),
            getSize(),
            getCategory(),
            getBrand(),
            String.format("%.2f", getCostPrice()),
            String.format("%.2f", getSalePrice()),
            getQuantity(),
            getFormattedDate()
        };
    }
    
}