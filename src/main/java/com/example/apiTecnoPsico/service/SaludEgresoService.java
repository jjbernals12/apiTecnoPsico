package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludEgreso;

import java.util.List;

public interface SaludEgresoService {
    void createEgreso (SaludEgreso saludEgreso);
    List<SaludEgreso> getAllEgreso ();
    void updateEgreso (Long id, SaludEgreso saludEgreso);
    void deleteEgreso (Long id);
}
