package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludHisplanti;
import com.example.apiTecnoPsico.exception.SaludHisplantiNotFoundException;
import com.example.apiTecnoPsico.repository.SaludHisplantiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaludHisplantiServiceImpl implements SaludHisplantiService{
    public final SaludHisplantiRepository saludHisplantiRepository;

    public SaludHisplantiServiceImpl(SaludHisplantiRepository saludHisplantiRepository) {
        this.saludHisplantiRepository = saludHisplantiRepository;
    }

    @Override
    public void createSaludHisplanti(SaludHisplanti saludHisplanti) {
        saludHisplantiRepository.save(saludHisplanti);
    }

    @Override
    public List<SaludHisplanti> getAllSaludHisplanti() {
        return saludHisplantiRepository.findAll();
    }

    @Override
    public void updateSaludHisplanti(Long id, SaludHisplanti saludHisplanti) {
        SaludHisplanti saludHisplanti1 = saludHisplantiRepository.findById(id).orElseThrow(() -> new SaludHisplantiNotFoundException("No se encuentra"));
        saludHisplanti.setId(id);
        saludHisplantiRepository.save(saludHisplanti);
    }

    @Override
    public void deleteSaludHisplanti(Long id) {
        saludHisplantiRepository.deleteById(id);
    }
}
