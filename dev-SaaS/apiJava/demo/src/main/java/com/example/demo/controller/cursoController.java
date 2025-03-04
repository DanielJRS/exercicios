package com.example.demo.controller;

import com.example.demo.model.dataModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cursoController {

    @GetMapping("/curso")
    public dataModel obterDadosCurso(){
        return new dataModel(2, "Análise e Desenvolvimento de Sistemas", "Tecnologia");
    }
}
