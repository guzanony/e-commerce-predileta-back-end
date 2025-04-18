package com.example.e_commerce_predileta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    @GetMapping("/teste")
    public String teste() {
      return "Endpoint test";
    }

    @GetMapping("/testeNovo")
    public String Home() {
        return "Home";
    }
}
