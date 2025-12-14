package Desafio04;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DistanceConverter distanceConverter = new DistanceConverter();

        System.out.println("Conversor de Distância: ");
        int choice = -1;
        double distanceValue = 0;

        while(choice != 0){
            System.out.println("""
                    Digite a escolha que queira fazer, ou digite 0 para sair:
                    1 - metros para centímetros;
                    2 - centímetros para metros;
                    3 - quilômetros para metros;
                    4 - metros para quilômetros;
                    5 - metros para milhas.
                    """);
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 0:
                            System.out.println("Adeus!!");
                            break;
                        case 1:
                            System.out.println("Digite o valor em metros: ");
                            distanceValue = scanner.nextDouble();
                            System.out.println("Valor em centímetros: " + distanceConverter.metersToCentimeters(distanceValue));
                            break;
                        case 2:
                            System.out.println("Digite o valor em centímetros: ");
                            distanceValue = scanner.nextDouble();
                            System.out.println("Valor em metros: " + distanceConverter.centimeterToMeters(distanceValue));
                            break;
                        case 3:
                            System.out.println("Digite o valor em quilômetros: ");
                            distanceValue = scanner.nextDouble();
                            System.out.println("Valor em metros: " + distanceConverter.kilometersToMeters(distanceValue));
                            break;
                        case 4:
                            System.out.println("Digite o valor em metros: ");
                            distanceValue = scanner.nextDouble();
                            System.out.println("Valor em quilômetros: " + distanceConverter.metersToKilometers);
                            break;
                        case 5:
                            System.out.println("Digite o valor em metros: ");
                            distanceValue = scanner.nextDouble();
                            System.out.println("Valor em milhas: " + distanceConverter.metersToMiles(distanceValue));
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                            break;
                    }
                }
    }
}