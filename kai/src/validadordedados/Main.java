package validadordedados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("""
                Escolha uma das opções abaixo:

                1. Verificar se o número é PAR ou ÍMPAR;
                2. Verificar se o número é POSITIVO, NEGATIVO ou IGUAL A ZERO;
                3. Verificar se o ano é BISSEXTO;
                4. Sair.

                    """);
            opcao = input.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira um NÚMERO para saber se ele é PAR ou ÍMPAR: ");
                    int numero = input.nextInt();

                    ValidadorParImpar validadorParImpar = new ValidadorParImpar(numero);
                    validadorParImpar.validarNumeros();
                }
                case 2 -> {
                    System.out.println("Insira um NÚMERO para saber se ele é POSITIVO, NEGATIVO ou IGUAL A ZERO: ");
                    int numero1 = input.nextInt();

                    ValidadorPositivoNegativoZero validadorPositivoNegativoZero = new ValidadorPositivoNegativoZero(numero1);
                    validadorPositivoNegativoZero.validarNumeros();
                }
                case 3 -> {
                    System.out.println("Insira um ANO para saber se ele é BISSEXTO: ");
                    int numero2 = input.nextInt();

                    ValidadorAnoBissexto validadorAnoBissexto = new ValidadorAnoBissexto(numero2);
                    validadorAnoBissexto.validarNumeros();
                }
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Entrada inválida. Tente novamente.");
            }
        } while (opcao != 4);
        input.close();
    }
}
