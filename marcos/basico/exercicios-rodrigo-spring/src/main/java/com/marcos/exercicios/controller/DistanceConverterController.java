package com.marcos.exercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcos.exercicios.service.distanceconverter.DistanceConverterImpl;

@RequestMapping("/converter")
@Controller
public class DistanceConverterController {
    @Autowired
    DistanceConverterImpl distanceConverterImpl;

    @GetMapping
    public String converter(){
        distanceConverterImpl.showConverter();
        return "Conversor de distância inicializado.";
    }

}
