package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraMunicipios;

import java.util.List;

public interface MaestraMunicipiosService {
    void createMunicipio (MaestraMunicipios maestraMunicipios, Long id);
    List<MaestraMunicipios> getAllMunicipios ();
    void updateMunicipio (Long id, MaestraMunicipios maestraMunicipios);
    void deleteMunicipio (Long id);
}
