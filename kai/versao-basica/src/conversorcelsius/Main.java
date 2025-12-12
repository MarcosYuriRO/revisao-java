package conversorcelsius;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Insira a temperatura a ser convertida: ");
        int temperatura1 = input.nextInt();

        //Fahrenheit
        ConversorCelsiusFahrenheit conversorFahrenheit = new ConversorCelsiusFahrenheit(temperatura1);
        conversorFahrenheit.converterCelsius();

        //Kelvin
        ConversorCelsiusKelvin conversorKelvin = new ConversorCelsiusKelvin(temperatura1);
        conversorKelvin.converterCelsius();
        input.close();
    }
}