package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraTipovincs;

import java.util.List;

public interface MaestraTipovincsService {
    void createMaestraTipovincs (MaestraTipovincs maestraTipovincs);
    List<MaestraTipovincs> getAllMaestraTipovincs ();
    void updateMaestraTipovincs (Long id, MaestraTipovincs maestraTipovincs);
    void deleteMaestraTipovincs (Long id);
}
