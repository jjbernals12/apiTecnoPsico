package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraEspecial;

import java.util.List;

public interface MaestraEspecialService {
    void createMaestraEspecial (MaestraEspecial maestraEspecial);
    List<MaestraEspecial> getAllMaestraEspecial ();
    void updateMaestraEspecial (Long id, MaestraEspecial maestraEspecial);
    void deleteMaestraEspecial (Long id);
}
