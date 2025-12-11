package calculadoraimc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o seu peso: ");
        int peso = input.nextInt();

        System.out.println("Insira a sua altura: ");
        double altura = input.nextDouble();

        CalculadoraImc calculadoraIMC = new CalculadoraImc(peso, altura);
        calculadoraIMC.calcularImc();
        
        input.close();
    }
}
