package conversorunidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Conversores de metros
        Scanner scan = new Scanner(System.in);

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
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    // Metros para centímetros
                    System.out.println("Insira quantos METROS você deseja converter para CENTÍMETROS (cm): ");
                    int metros = scan.nextInt();

                    ConversorMetrosCm conversorMetrosCm = new ConversorMetrosCm(metros);
                    conversorMetrosCm.converterMetros();
                    break;
                case 2:
                    // Centímetros para Metros
                    System.out.println("Insira quantos CENTÍMETROS (cm) você deseja converter para METROS: ");

                    int centimetros = scan.nextInt();

                    ConversorCentimetrosMetros conversorCmMetros = new ConversorCentimetrosMetros(centimetros);
                    conversorCmMetros.converterMetros();
                    break;
                case 3:
                    System.out.println("Insira quantos QUILÔMETROS (km) você deseja converter para METROS: ");
                    int quilometros = scan.nextInt();

                    ConversorKmMetros conversorKmMetros = new ConversorKmMetros(quilometros);
                    conversorKmMetros.converterMetros();
                    break;
                case 4:
                    System.out.println("Insira quantos METROS você deseja converter para QUILÔMETROS (km): ");
                    int metros1 = scan.nextInt();

                    ConversorMetrosKm conversorMetrosKm = new ConversorMetrosKm(metros1);
                    conversorMetrosKm.converterMetros();
                    break;
                case 5:
                    System.out.println("Insira quantos METROS você deseja converter para MILHAS (mi): ");
                    int metros2 = scan.nextInt();

                    ConversorMetrosMilhas conversorMetrosMilhas = new ConversorMetrosMilhas(metros2);
                    conversorMetrosMilhas.converterMetros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("O valor inserido não foi aceito.");
                    break;
            }
        } while (opcao != 0);
        scan.close();
    }
}
