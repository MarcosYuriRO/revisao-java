package com.kaillanny.estudos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaillanny.estudos.exercicios.service.produto.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/desconto")
    public String aplicarDesconto() {
        produtoService.calcularDesconto();
        return "Desconto pode ter sido aplicado. Verifique o console.";
    }
}