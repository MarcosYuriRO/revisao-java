package com.kaillanny.estudos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.kaillanny.estudos.exercicios.service.unidades.UnidadesService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/unidades")
public class UnidadesController {

    @Autowired
    private UnidadesService unidadesService;

    @GetMapping("/converter")
    public String aplicarConversão() {
        unidadesService.converterUnidades();
        return "Conversão aplicada. Verifique o console.";
    }
}