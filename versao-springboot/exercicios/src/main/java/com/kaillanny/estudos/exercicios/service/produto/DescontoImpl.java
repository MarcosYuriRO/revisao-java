package com.kaillanny.estudos.exercicios.service.desconto;

import java.util.Scanner;

import com.kaillanny.estudos.exercicios.service.desconto.DescontoService;

@Service
public class DescontoImpl implements DescontoService{
    Scanner input = new Scanner(System.in);

    @Autowired
    private Produto produto;

    @Override
    public void calcularDesconto() {
        double desconto;
        if (produto.getPreco() >= 100) {
            desconto = produto.getPreco() - (produto.getPreco() * 0.10);
            System.out.println("Valor recebeu desconto de 10%. Valor atual: " + desconto);
        } else if (produto.getPreco() >= 250) {
            desconto = produto.getPreco() - (produto.getPreco() * 0.20);
            System.out.println("Valor recebeu desconto de 20%. Valor atual: " + desconto);
        } else if (produto.getPreco() < 500) {
            desconto = produto.getPreco() - (produto.getPreco() * 0.30);
            System.out.println("Valor recebeu desconto de 30%. Valor atual: " + desconto);
        } else {
            System.out.println("Não foi possível aplicar o desconto.");
        }


}
