package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludHiselem;
import com.example.apiTecnoPsico.exception.SaludHiselemNotFoundException;
import com.example.apiTecnoPsico.repository.SaludHiselemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaludHiselemServiceImpl implements SaludHiselemService{
    public final SaludHiselemRepository saludHiselemRepository;

    public SaludHiselemServiceImpl(SaludHiselemRepository saludHiselemRepository) {
        this.saludHiselemRepository = saludHiselemRepository;
    }

    @Override
    public void createSaludHiselem(SaludHiselem saludHiselem) {
        saludHiselemRepository.save(saludHiselem);
    }

    @Override
    public List<SaludHiselem> getAllSaludHiselem() {
        return saludHiselemRepository.findAll();
    }

    @Override
    public void updateSaludHiselem(Long id, SaludHiselem saludHiselem) {
        SaludHiselem saludHiselem1 = saludHiselemRepository.findById(id).orElseThrow(()->new SaludHiselemNotFoundException("No se encuentra"));
        saludHiselem.setId(id);
        saludHiselemRepository.save(saludHiselem);
    }

    @Override
    public void deleteSaludHiselem(Long id) {
        saludHiselemRepository.deleteById(id);
    }
}
