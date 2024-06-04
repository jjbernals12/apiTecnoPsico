package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludCupscapis;

import java.util.List;

public interface SaludCupscapisService {
    void createSaludCupscapis (SaludCupscapis saludCupscapis);
    List<SaludCupscapis> getAllSaludCupscapis ();
    void updateSaludCupscapis (Long id, SaludCupscapis saludCupscapis);
    void deleteSaludCupscapis (Long id);
}
