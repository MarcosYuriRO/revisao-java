package com.kaillanny.estudos.exercicios.service.unidades;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaillanny.estudos.exercicios.model.Unidades;

@Service
public class UnidadesImpl implements UnidadesService{

    Scanner input = new Scanner(System.in);

    int metros;

    Unidades unidades = new Unidades(metros);
    
    @Override
    public void converterUnidades() {
        int opcao;

        do {

            System.out.println("""

                Conversor de Unidades de Medida
                (Escolha uma opção abaixo)

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
                    unidades.setMetros(metros);

                    int centimetros = (metros * 10) * 10;
                    System.out.printf("A conversão de %d metros para centímetros é de: %d cm.", metros, centimetros);
                    break;
                }
                case  2 -> {
                    // Centímetros para Metros
                    System.out.println("Insira quantos CENTÍMETROS (cm) você deseja converter para METROS: ");

                    int centimetros = input.nextInt();
                    unidades.setMetros(centimetros);

                    int metros = (centimetros / 10) / 10;
                    System.out.printf("A conversão de %d centímetros para metros é de: %d m.",  centimetros, metros);
                    break;
                }
                case 3 -> {
                    // Quilômetros para Metros
                    System.out.println("Insira quantos QUILÔMETROS (km) você deseja converter para METROS: ");

                    int quilometros = input.nextInt();
                    unidades.setMetros(quilometros);

                    int metros = (quilometros * 10) * 10 * 10;
                    System.out.printf("A conversão de %d quilometros para metros é de: %d m.",  quilometros, metros);
                    break;
                }
                case 4 -> {
                    // Metros para quilôetros
                    System.out.println("Insira quantos METROS você deseja converter para QUILÔMETROS (km): ");

                    int metros = input.nextInt();
                    unidades.setMetros(metros);

                    int quilometros = (metros / 10) / 10 / 10;
                    System.out.printf("A conversão de %d metros para quilometros é de: %d km.", metros, quilometros);
                    break;
                }
                case 5 -> {
                    // Metros para milhas
                    System.out.println("Insira quantos METROS você deseja converter para MILHAS (mi): ");

                    int metros = input.nextInt();
                    unidades.setMetros(metros);

                    final double CONVERTER_PARA_MILHAS = 0.00062137119;
                    double metrosConvertidos = (double) metros * CONVERTER_PARA_MILHAS;
                    System.out.printf("A conversão de %d metros para milhas é de: %f mi.", metros, metrosConvertidos);
                    break;
                }
                case -1 -> {
                    System.out.println("Encerrando o programa...");
                    break;
                }
                default -> System.out.println("O valor inserido não foi aceito.");
            }
        } while (opcao != -1);
        input.close();
    }
}