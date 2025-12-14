package com.kaillanny.estudos.exercicios.service.imc;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.kaillanny.estudos.exercicios.model.Imc;

@Service
public class ImcImpl implements ImcService{

    Scanner input = new Scanner(System.in);

    int peso;
    double altura;

    /*public int definirPeso() {
                return peso;
    }

    public double definirAltura() {
        
        return altura;
    }*/

    Imc imc = new Imc(peso, altura);

    @Override
    public void calcularImc() {
        System.out.println("Insira o seu peso (em kg): ");
        peso = input.nextInt();
        imc.setPeso(peso);
        peso = imc.getPeso();

        System.out.println("Insira a sua altura (em metros): ");
        altura = input.nextDouble();
        imc.setAltura(altura);
        altura = imc.getAltura();

        double imcCalculado = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        if (imcCalculado < 18.5) {
            System.out.println("De acordo com o seu IMC, você está: Abaixo do peso.");
        } else if (imcCalculado > 18.5 && imcCalculado < 24.9) {
            System.out.println("De acordo com o seu IMC, você está: Peso normal.");
        } else if (imcCalculado > 25 && imcCalculado < 29.9) {
            System.out.println("De acordo com o seu IMC, você está: Sobrepeso.");
        } else if (imcCalculado > 20 && imcCalculado < 34.9) {
            System.out.println("De acordo com o seu IMC, você está: Obesidade grau I.");
        } else if (imcCalculado > 35 && imcCalculado < 39.9) {
            System.out.println("De acordo com o seu IMC, você está: Obesidade grau II.");
        } else if (imcCalculado > 40) {
            System.out.println("De acordo com o seu IMC, você está: Obesidade grau III.");
        } else {
            System.out.println("Ocorreu um erro ao tentar exibir um resultado.");
        }
    }
}