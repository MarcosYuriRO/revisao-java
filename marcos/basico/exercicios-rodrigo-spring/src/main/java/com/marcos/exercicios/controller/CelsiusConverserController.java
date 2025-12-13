package com.marcos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcos.exercicios.service.temperature.ConverterCelsiusImpl;

@RequestMapping("/temperature")
@Controller
public class CelsiusConverserController {
    @Autowired
    ConverterCelsiusImpl converterCelsiusImpl;

    @GetMapping("/converter")
    public String converter(){
        converterCelsiusImpl.converterMenu();
        return "Conversor Inicializado.";
    }

}
