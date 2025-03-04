package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class dataHoraController {

    @GetMapping("/dataHora")
    public Map<String, String> obterDataHora(){
        Map<String, String> dataHora = new HashMap<>();

            LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern(("dd/MM/yyyy HH:mm:ss"));

            dataHora.put("Data e hora:", agora.format(formato));

        return dataHora;
    }
}
