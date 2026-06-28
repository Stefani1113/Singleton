package com.patron.singleton.service;

import org.springframework.stereotype.Service;

@Service
public class EstadisticasService {
    private int totalConsultas;

    public void incrementarConsultas() {
        totalConsultas++;
    }
    
    public int obtenerTotalConsultas() {
        return totalConsultas;
    }
}
