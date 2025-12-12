package com.kaillanny.estudos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaillanny.estudos.exercicios.service.TemperaturaService;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaController {
    
    @Autowired
    private TemperaturaService temperaturaService;

    @GetMapping("/converter")
    public String exibirConversão() {
        temperaturaService.converterTemperatura();
        return "Conversão realizada! Verifique o console.";
    }
}
