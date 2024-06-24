package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludTarifas;

import java.util.List;

public interface SaludTarifasService {
    void createTarifa (SaludTarifas saludTarifas);
    List<SaludTarifas> getAlLTarifas ();
    void updateTarifas (Long id, SaludTarifas saludTarifas);
    void deleteTarifas (Long id);
}
