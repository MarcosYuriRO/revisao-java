
import java.util.Scanner;

import CalculadoraImc.CalculadoraImc;
import Conversor.ConversorCelsiusFahrenheit;
import Conversor.ConversorCelsiusKelvin;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Conversor de Celsius
        System.out.println("Insira a temperatura a ser convertida: ");
        int temperatura1 = scan.nextInt();

        //Fahrenheit
        ConversorCelsiusFahrenheit conversorFahrenheit = new ConversorCelsiusFahrenheit(temperatura1);
        conversorFahrenheit.converterCelsius();

        //Kelvin
        ConversorCelsiusKelvin conversorKelvin = new ConversorCelsiusKelvin(temperatura1);
        conversorKelvin.converterCelsius();


        //Calculadora de IMC
        System.out.println("Insira o seu peso: ");
        int peso = scan.nextInt();

        System.out.println("Insira a sua altura: ");
        double altura = scan.nextDouble();

        CalculadoraImc calculadoraIMC = new CalculadoraImc(peso, altura);
        calculadoraIMC.calcularImc();


        //Calculadora de Descontos]
        System.out.println("Insira o valor da compra: ");
        int preco1 = scan.nextInt();

        //CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto(preco1);
        //calculadoraDescontos.calcularDesconto();

        //Conversor de Unidades
        
    }
}
