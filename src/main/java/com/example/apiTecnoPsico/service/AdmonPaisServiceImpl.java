package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.AdmonPais;
import com.example.apiTecnoPsico.repository.AdmonPaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdmonPaisServiceImpl implements AdmonPaisService{
    private final AdmonPaisRepository admonPaisRepository;

    public AdmonPaisServiceImpl(AdmonPaisRepository admonPaisRepository) {
        this.admonPaisRepository = admonPaisRepository;
    }

    @Override
    public void createPais(AdmonPais admonPais) {
        admonPaisRepository.save(admonPais);
    }

    @Override
    public List<AdmonPais> getAllPais() {
        return admonPaisRepository.findAll();
    }

    @Override
    public void updatePais(Long id, AdmonPais admonPais) {
        AdmonPais admonPais1 = admonPaisRepository.findById(id).orElseThrow(()->new RuntimeException("No se encontro"));
        admonPais.setId(id);
        admonPaisRepository.save(admonPais);
    }

    @Override
    public void deletePais(Long id) {
        admonPaisRepository.deleteById(id);
    }
}
