package com.marcos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcos.exercicios.service.discount.DiscountCalculatorImpl;

@RequestMapping("/product")
@Controller
public class DiscountCalculatorController {
    @Autowired
    DiscountCalculatorImpl discountCalculatorImpl;

    @GetMapping("/calculate")
    public String calculate(){
        discountCalculatorImpl.showCalculator();
        return "Calculando desconto";
    }

}
