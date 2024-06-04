package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraEps;

import java.util.List;

public interface MaestraEpsService {
    void createMaestraEps (MaestraEps maestraEps);
    List<MaestraEps> getAllMaestraEps ();
    void updateMaestraEps (Long id, MaestraEps maestraEps);
    void deleteMaestraEps (Long id);
}
