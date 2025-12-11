package calculadoradescontos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor da sua compra: ");
        int valorDaCompra = input.nextInt();

        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto(valorDaCompra);
        calculadoraDesconto.calcularDesconto();

        input.close();
    }
}
