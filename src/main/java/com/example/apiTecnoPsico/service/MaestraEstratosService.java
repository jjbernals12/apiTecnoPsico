package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraEstratos;

import java.util.List;

public interface MaestraEstratosService {
    void createMaestraEstratos (MaestraEstratos maestraEstratos);
    List<MaestraEstratos> getAllMaestraEstratos ();
    void updateMaestraEstratos (Long id, MaestraEstratos maestraEstratos);
    void deleteMaestraEstratos (Long id);
}
