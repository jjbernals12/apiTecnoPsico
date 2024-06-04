package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludHisplanti;

import java.util.List;

public interface SaludHisplantiService {
    void createSaludHisplanti (SaludHisplanti saludHisplanti);
    List<SaludHisplanti> getAllSaludHisplanti ();
    void updateSaludHisplanti (Long id, SaludHisplanti saludHisplanti);
    void deleteSaludHisplanti (Long id);
}
