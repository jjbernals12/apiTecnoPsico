package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraTipoaten;

import java.util.List;

public interface MaestraTipoatenService {
    void createTipoaten (MaestraTipoaten maestraTipoaten);
    List<MaestraTipoaten> getAllTipoaten ();
    void updateTipoaten (Long id, MaestraTipoaten maestraTipoaten);
    void deleteTipoaten (Long id);
}
