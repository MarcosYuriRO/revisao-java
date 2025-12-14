package com.kaillanny.estudos.exercicios.service.dados;

import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.Scanner;

@Service
public class DadosImpl implements DadosService {

    @Override
    public void validarDados() {

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

                    switch (numero % 2) {
                        case 0 -> System.out.printf("O número %d é PAR.", numero);
                        case 1 -> System.out.printf("O número %d é ÍMPAR.", numero);
                        default -> System.out.println("Entrada inválida. Tente novamente.");
                    }
                }
                case 2 -> {
                    System.out.println("Insira um NÚMERO para saber se ele é POSITIVO, NEGATIVO ou IGUAL A ZERO: ");
                    int numero = input.nextInt();

                    if (numero > 0) {
                        System.out.printf("O número %d é POSITIVO.", numero);
                    } else if (numero < 0) {
                        System.out.printf("O número %d é NEGATIVO.", numero);
                    } else if (numero == 0) {
                        System.out.printf("O número %d é IGUAL A ZERO.", numero);
                    } else {
                        System.out.println("Entrada inválida. Tente novamente.");
                    }
                }
                case 3 -> {
                    System.out.println("Insira um ANO para saber se ele é BISSEXTO: ");
                    int numero = input.nextInt();

                    if (Year.isLeap(numero)) {
                        System.out.printf("O ano %d é ano BISSEXTO.", numero);
                    } else if (!Year.isLeap(numero)) {
                        System.out.printf("O ano %d NÃO é bissexto.", numero);
                    } else {
                        System.out.println("Entrada inválida. Tente novamente.");
                    }
                }
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Entrada inválida. Tente novamente.");
            }
        } while (opcao != 4);
        input.close();
    }
}
