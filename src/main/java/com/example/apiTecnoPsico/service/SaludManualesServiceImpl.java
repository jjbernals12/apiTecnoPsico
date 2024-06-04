package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludManuales;
import com.example.apiTecnoPsico.exception.SaludManualesNotFoundException;
import com.example.apiTecnoPsico.repository.SaludManualesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaludManualesServiceImpl implements SaludManualesService{
    public final SaludManualesRepository saludManualesRepository;

    public SaludManualesServiceImpl(SaludManualesRepository saludManualesRepository) {
        this.saludManualesRepository = saludManualesRepository;
    }

    @Override
    public void createSaludManuales(SaludManuales saludManuales) {
        saludManualesRepository.save(saludManuales);
    }

    @Override
    public List<SaludManuales> getAllSaludManuales() {
        return saludManualesRepository.findAll();
    }

    @Override
    public void updateSaludManuales(Long id, SaludManuales saludManuales) {
        SaludManuales saludManuales1 = saludManualesRepository.findById(id).orElseThrow(()->new SaludManualesNotFoundException("No se encuentra"));
        saludManuales.setId(id);
        saludManualesRepository.save(saludManuales);
    }

    @Override
    public void deleteSaludManuales(Long id) {
        saludManualesRepository.deleteById(id);
    }
}
