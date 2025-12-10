
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.println("Digite seu peso em kg:");
        double weightValue = scanner.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double heightValue = scanner.nextDouble();

        IMCCalculator imcCalculator = new IMCCalculator(weightValue, heightValue);
        imcCalculator.calculateIMC(weightValue, heightValue);

    }
}
