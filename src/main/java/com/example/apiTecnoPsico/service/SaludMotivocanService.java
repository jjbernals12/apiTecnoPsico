package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludMotivocan;

import java.util.List;

public interface SaludMotivocanService {
    void createMotivocan (SaludMotivocan saludMotivocan);
    List<SaludMotivocan> getAllMotivocan ();
    void updateMotivocan (Long id, SaludMotivocan saludMotivocan);
    void deleteMotivocan (Long id);
}
