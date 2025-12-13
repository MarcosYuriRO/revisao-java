package com.marcos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcos.exercicios.service.calculator.CalculatorImpl;

@RequestMapping("/calculator")
@Controller
public class CalculatorController {
    @Autowired
    CalculatorImpl calculatorImpl;

    public String calculator(){
        calculatorImpl.showCalculator();
        return "Calculadora ligada!";
    }
}
