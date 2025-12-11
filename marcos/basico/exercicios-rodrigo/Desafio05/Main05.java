package Desafio05;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Validador de Dados");
        int choice = -1;
        int number;

        while (choice != 0) {

            System.out.println("""
                    O que você quer verificar?

                    1. Verificar Par ou Ímpar;
                    2. Verificar Positivo, Negativo ou 0;
                    3. Verificar Ano Bissexto;
                    0. Sair da Aplicação.
                    """);

            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Digite um número inteiro: ");
                    number = scanner.nextInt();
                    calculator.calculateEvenOrOdd(number);
                    break;
                case 2:
                    System.out.println("Digite um número inteiro: ");
                    number = scanner.nextInt();
                    calculator.calculatePositivity(number);
                    break;
                case 3:
                    System.out.println("Digite um ano: ");
                    number = scanner.nextInt();
                    calculator.calculateBissext(number);
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;
            
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }
    }
}
