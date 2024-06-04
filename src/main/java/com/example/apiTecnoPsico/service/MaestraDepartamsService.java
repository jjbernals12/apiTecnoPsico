package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraDepartams;

import java.util.List;

public interface MaestraDepartamsService {
    void createMaestraDepartams (MaestraDepartams maestraDepartams);
    List<MaestraDepartams> getAllMaestraDepartams ();
    void updateMaestraDepartams (Long id, MaestraDepartams maestraDepartams);
    void deleteMaestraDepartams (Long id);
}
