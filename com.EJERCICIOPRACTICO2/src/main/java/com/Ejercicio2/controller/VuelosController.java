package com.Ejercicio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Vuelos") //nombre de la carpeta
public class VuelosController {
    @GetMapping("/Vuelos") //nombre del html
    public String create() {

        return "/Vuelos/Vuelos"; //Ruta completa
    }
}