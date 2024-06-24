package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludRipcons;

import java.util.List;

public interface SaludRipconsService {
    void createRipcons (SaludRipcons saludRipcons);
    List<SaludRipcons> getAllRipcons ();
    void updateRipcons (Long id, SaludRipcons saludRipcons);
    void deleteRipcons (Long id);
}
