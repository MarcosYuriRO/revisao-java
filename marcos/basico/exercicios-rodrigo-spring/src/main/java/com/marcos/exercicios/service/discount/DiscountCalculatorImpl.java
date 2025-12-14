package com.marcos.exercicios.service.discount;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.exercicios.model.Product;

@Service
public class DiscountCalculatorImpl implements DiscountCalculatorService {
    @Autowired
    Product product;

    Scanner scanner = new Scanner(System.in);

    public void showCalculator(){
System.out.println("Calculadora de descontos: ");
        System.out.println("Digite o preço: ");
        double priceValue = scanner.nextDouble();
        product.setPrice(priceValue);

        if(product.getPrice() >= 50){
            System.out.println("Valor após desconto: " + calculateDiscount());
        } else {
            System.out.println("Valor sem desconto: " + product.getPrice());
        }
        scanner.close();
    }

    @Override
    public double calculateDiscount() {
         if (product.getPrice() >= 50 && product.getPrice() <= 150){
            product.setDiscount(0.1);
        } else if (product.getPrice() > 150){
            product.setDiscount(0.25);
        } else {
            product.setDiscount(0);
        }
        double discountValue = product.getPrice() * product.getDiscount();
        double discountedPrice = product.getPrice() - discountValue;
        return discountedPrice;
    }
}
