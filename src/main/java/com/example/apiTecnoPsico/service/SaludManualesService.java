package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludManuales;

import java.util.List;

public interface SaludManualesService {
    void createSaludManuales (SaludManuales saludManuales);
    List<SaludManuales> getAllSaludManuales ();
    void updateSaludManuales (Long id, SaludManuales saludManuales);
    void deleteSaludManuales (Long id);
}
