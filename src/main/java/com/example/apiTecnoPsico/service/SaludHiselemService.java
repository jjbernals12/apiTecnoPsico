package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludHiselem;

import java.util.List;

public interface SaludHiselemService {
    void createSaludHiselem (SaludHiselem saludHiselem);
    List<SaludHiselem> getAllSaludHiselem ();
    void updateSaludHiselem (Long id, SaludHiselem saludHiselem);
    void deleteSaludHiselem (Long id);
}
