package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludCies;

import java.util.List;

public interface SaludCiesService {
    void createSaludCies (SaludCies saludCies);
    List<SaludCies> getAllSaludCies ();
    void updateSaludCies (Long id, SaludCies saludCies);
    void deleteSaludCies (Long id);
}
