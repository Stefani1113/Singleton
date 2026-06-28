package com.patron.singleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patron.singleton.service.EstadisticasService;

@RestController
@RequestMapping("/aprendices")
public class AprendizController {
    private final EstadisticasService estadisticas;

    public AprendizController(
        EstadisticasService estadisticas) {
            this.estadisticas = estadisticas;
        }

    @GetMapping
    public String aprendices() {
        estadisticas.incrementarConsultas();

        return "Consulta realizada";
    }
}
