package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraOcupacs;

import java.util.List;

public interface MaestraOcupacsService {
    void createMaestraOcupacs (MaestraOcupacs maestraOcupacs);
    List<MaestraOcupacs> getAllMaestraOcupacs ();
    void updateMaestraOcupacs (Long id, MaestraOcupacs maestraOcupacs);
    void deleteMaestraOcupacs (Long id);
}
