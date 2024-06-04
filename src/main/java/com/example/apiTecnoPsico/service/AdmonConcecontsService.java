package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.AdmonConceconts;

import java.util.List;

public interface AdmonConcecontsService {
    void createAdmonConceconts (AdmonConceconts admonConceconts);
    List<AdmonConceconts> getAllAdmonConceconts ();
    void updateAdmonConceconts (Long id, AdmonConceconts admonConceconts);
    void deleteAdmonConceconts (Long id);
}
