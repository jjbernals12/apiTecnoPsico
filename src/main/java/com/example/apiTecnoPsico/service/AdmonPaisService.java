package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.AdmonPais;

import java.util.List;

public interface AdmonPaisService {
    void createPais (AdmonPais admonPais);
    List<AdmonPais> getAllPais ();
    void updatePais (Long id,AdmonPais admonPais);
    void deletePais (Long id);
}
