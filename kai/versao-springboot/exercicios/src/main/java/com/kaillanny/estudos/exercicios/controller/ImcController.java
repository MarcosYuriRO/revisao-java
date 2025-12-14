package com.kaillanny.estudos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaillanny.estudos.exercicios.service.imc.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {

    @Autowired 
    private ImcService imcService;

    @GetMapping("/calcular") 
    public String exibirCalculo(){
        imcService.calcularImc();
        return "Cálculo realizado com sucesso. Verifique o console";
    }
}