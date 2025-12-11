package com.marcos.exercicios.Desafio03;

public class DiscountCalculator {
    private double discount;

    public double calculateDiscount(double totalPrice){
        if (totalPrice >= 50 && totalPrice <= 150){
            discount = 0.1;
        } else if (totalPrice > 150){
            discount = 0.25;
        } else {
            discount = 0;
        }
        double discountValue = totalPrice * discount;
        double discountedPrice = totalPrice - discountValue;
        return discountedPrice;
    }
    
}