package com.marcos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcos.exercicios.service.imc.ImcCalculatorImpl;

@RequestMapping("/imc")
@Controller
public class ImcCalculatorController {
    @Autowired
    ImcCalculatorImpl imcCalculatorImpl;

    @GetMapping
    public String calculator() {
        imcCalculatorImpl.showCalculator();
        return "Calculadora de IMC disponível";
    }

}
