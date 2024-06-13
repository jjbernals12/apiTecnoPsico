package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.Faseaten;

import java.util.List;

public interface FaseatenService {
    void createFaseaten (Faseaten faseaten);
    List<Faseaten> getAllFaseaten();
    void updateFaseaten (Long id, Faseaten faseaten);
    void deleteFaseaten (Long id);
}
