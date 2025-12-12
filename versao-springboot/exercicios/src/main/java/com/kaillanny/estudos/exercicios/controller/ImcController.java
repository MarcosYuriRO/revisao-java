package com.kaillanny.estudos.exercicios.controller;

import com.kaillanny.estudos.exercicios.service.imc.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {

    @Autowired 
    private ImcService imcService;

    @GetMapping("/calcular") 
    public String exibirCalculo(){
        imcService.calcularImc();
        return "Cálculo realizado com sucesso.";
    }
}
