package com.marcos.exercicios.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private double price;
    private double discount;

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    
}
