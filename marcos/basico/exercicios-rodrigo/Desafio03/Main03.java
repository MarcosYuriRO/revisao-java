package Desafio03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de descontos: ");
        System.out.println("Digite o preço: ");
        double priceValue = scanner.nextDouble();
        
        if (priceValue >= 50){
            DiscountCalculator discountCalculator = new DiscountCalculator();
            System.out.println("Valor com desconto: " + discountCalculator.calculateDiscount);
        } else {
            System.out.println("Valor sem desconto: " + priceValue);
        }
    }
}

