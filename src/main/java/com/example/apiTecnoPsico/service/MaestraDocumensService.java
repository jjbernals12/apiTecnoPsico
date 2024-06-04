package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraDocumens;

import java.util.List;

public interface MaestraDocumensService {
    void createMaestraDocumens (MaestraDocumens maestraDocumens);
    List<MaestraDocumens> getAllMaestraDocumens ();
    void updateMaestraDocumens (Long id, MaestraDocumens maestraDocumens);
    void deleteMaestraDocumens (Long id);
}
