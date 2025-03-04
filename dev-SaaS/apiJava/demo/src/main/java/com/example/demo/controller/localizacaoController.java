package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class localizacaoController {

    @GetMapping("/localizacao")
    public Map<String, String> obterLocalizacao(){
        Map<String, String> localizacao = new HashMap<>();

        try {
            InetAddress localhost = InetAddress.getLocalHost();

            localizacao.put("hostname", localhost.getHostName());
            localizacao.put("endereco_ip", localhost.getHostAddress());
            localizacao.put("ip_canonico", localhost.getCanonicalHostName());

        } catch (UnknownHostException error) {
            localizacao.put("error","Não foi possível obter as informações do servidor");
        }

        return localizacao;
    }
}
