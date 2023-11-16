package com.example.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensaje")
public class HolaMundoControlador {


    @GetMapping("/marco")
    public String marco() {
        return "Hola Marco, bienvenido";
    }


    @GetMapping("/solicitud")
    public ResponseEntity<String> gestion() {
        return new ResponseEntity<>(" me voy", HttpStatus.OK);

    }
}

