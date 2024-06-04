package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.Sieparams;

import java.util.List;

public interface SieParamsService {
    void createSieParams (Sieparams sieparams);
    List<Sieparams> getAllSieParams ();
    void updateSieParams (Long id, Sieparams sieParams);
    void deleteSieParams (Long id);
}
