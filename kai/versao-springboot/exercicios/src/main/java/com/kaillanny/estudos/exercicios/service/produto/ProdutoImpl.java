package com.kaillanny.estudos.exercicios.service.produto;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaillanny.estudos.exercicios.model.Produto;

@Service
public class ProdutoImpl implements ProdutoService {
    Scanner input = new Scanner(System.in);

    int preco;

    Produto produto = new Produto(preco);

    @Override 
    public void calcularDesconto() {
        System.out.println("Insira o preço da sua compra: ");
        preco = input.nextInt();
        produto.setPreco(preco);
        preco = produto.getPreco();

        double desconto;
        if (preco >= 100 && preco <= 249) {
            desconto = preco - (preco * 0.10);
            System.out.println("Valor recebeu desconto de 10%. Valor atual: " + desconto);
        } else if (preco >= 250 && preco <= 499) {
            desconto = preco - (preco * 0.20);
            System.out.println("Valor recebeu desconto de 20%. Valor atual: " + desconto);
        } else if (preco >= 500) {
            desconto = preco - (preco * 0.30);
            System.out.println("Valor recebeu desconto de 30%. Valor atual: " + desconto);
        } 
    }
}