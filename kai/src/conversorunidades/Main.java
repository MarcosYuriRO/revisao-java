package conversorunidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Conversores de metros
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("""

                    \nEscolha qual conversão você deseja fazer:
                    (Digite 0 para sair)

                    1. Metros para Centímetros;
                    2. Centímetros para Metros;
                    3. Quilômetros para Metros;
                    4. Metros para Quilômetros;
                    5. Metros para Milhas.

                        """);
            opcao = input.nextInt();
            switch (opcao) {
                case 1 -> {
                    // Metros para centímetros
                    System.out.println("Insira quantos METROS você deseja converter para CENTÍMETROS (cm): ");
                    int metros = input.nextInt();

                    ConversorMetrosCm conversorMetrosCm = new ConversorMetrosCm(metros);
                    conversorMetrosCm.converterMetros();
                }
                    
                case 2 -> {
                    // Centímetros para Metros
                    System.out.println("Insira quantos CENTÍMETROS (cm) você deseja converter para METROS: ");

                    int centimetros = input.nextInt();

                    ConversorCentimetrosMetros conversorCmMetros = new ConversorCentimetrosMetros(centimetros);
                    conversorCmMetros.converterMetros();
                    break;
                }
                case 3 -> {
                    System.out.println("Insira quantos QUILÔMETROS (km) você deseja converter para METROS: ");
                    int quilometros = input.nextInt();

                    ConversorKmMetros conversorKmMetros = new ConversorKmMetros(quilometros);
                    conversorKmMetros.converterMetros();
                    break;
                }
                case 4 -> {
                    System.out.println("Insira quantos METROS você deseja converter para QUILÔMETROS (km): ");
                    int metros1 = input.nextInt();

                    ConversorMetrosKm conversorMetrosKm = new ConversorMetrosKm(metros1);
                    conversorMetrosKm.converterMetros();
                }
                case 5 -> {
                    System.out.println("Insira quantos METROS você deseja converter para MILHAS (mi): ");
                    int metros2 = input.nextInt();

                    ConversorMetrosMilhas conversorMetrosMilhas = new ConversorMetrosMilhas(metros2);
                    conversorMetrosMilhas.converterMetros();
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("O valor inserido não foi aceito.");
            }
        } while (opcao != 0);
        input.close();
    }
}
