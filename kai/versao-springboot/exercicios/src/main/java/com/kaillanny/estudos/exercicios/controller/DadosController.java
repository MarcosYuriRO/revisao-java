package com.kaillanny.estudos.exercicios.controller;

import com.kaillanny.estudos.exercicios.service.dados.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados")
public class DadosController {

    @Autowired
    DadosService dadosService;

    @GetMapping("/validar")
    public String exibirDados() {
        dadosService.validarDados();
        return "Dados analisados com sucesso. Verifique o console.";
    }
}
