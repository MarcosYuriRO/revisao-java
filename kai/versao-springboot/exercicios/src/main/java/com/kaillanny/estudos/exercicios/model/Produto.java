package com.kaillanny.estudos.exercicios.model;

public class Produto {
    protected int preco;

    public Produto(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
