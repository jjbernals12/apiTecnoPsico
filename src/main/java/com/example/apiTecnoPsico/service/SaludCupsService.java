package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludCups;

import java.util.List;

public interface SaludCupsService {
    void createCups (SaludCups saludCups);
    List<SaludCups> getAllCups ();
    void updateCups (Long id, SaludCups saludCups);
    void deleteCups (Long id);
}
