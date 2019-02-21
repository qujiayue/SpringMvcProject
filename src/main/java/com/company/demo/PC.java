package com.company.demo;

import java.math.BigDecimal;

public class PC {
    private String brand;
    private BigDecimal price;

    public PC() {
    }

    public PC(String brand, BigDecimal price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
