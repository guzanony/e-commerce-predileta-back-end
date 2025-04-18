package com.example.e_commerce_predileta.domains.products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productsId;
    private String name;
    private String description;
    private String price;
    private String stockQuantity;
    private byte[] image;

    public Products(Long productsId, String name, String description, String price, String stockQuantity, byte[] image) {
        this.productsId = productsId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.image = image;
    }

    public Long getProductsId() {
        return productsId;
    }

    public void setProductsId(Long productsId) {
        this.productsId = productsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
