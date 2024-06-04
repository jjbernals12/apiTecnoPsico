package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraGrupserv;

import java.util.List;

public interface MaestraGrupservService {
    void createMaestraGrupserv (MaestraGrupserv maestraGrupserv);
    List<MaestraGrupserv> getAllMaestraGrupserv ();
    void updateMaestraGrupserv (Long id, MaestraGrupserv maestraGrupserv);
    void deleteMaestraGrupserv (Long id);
}
