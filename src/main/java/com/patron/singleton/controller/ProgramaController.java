package com.patron.singleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patron.singleton.service.EstadisticasService;

@RestController
@RequestMapping("/programas")
public class ProgramaController {
    private final EstadisticasService estadisticas;

    public ProgramaController(
        EstadisticasService estadisticas) {
            this.estadisticas = estadisticas;
        }

    @GetMapping
    public String programas() {
        estadisticas.incrementarConsultas();

        return "Consulta realizada";
    }
}
