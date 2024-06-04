package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.AdmonConceconts;
import com.example.apiTecnoPsico.exception.AdmonConcecontsNotFoundException;
import com.example.apiTecnoPsico.repository.AdmonConcecontsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmonConcecontsServiceImpl implements AdmonConcecontsService{
    private final AdmonConcecontsRepository admonConcecontsRepository;

    public AdmonConcecontsServiceImpl(AdmonConcecontsRepository admonConcecontsRepository) {
        this.admonConcecontsRepository = admonConcecontsRepository;
    }

    @Override
    public void createAdmonConceconts(AdmonConceconts admonConceconts) {
        admonConcecontsRepository.save(admonConceconts);
    }

    @Override
    public List<AdmonConceconts> getAllAdmonConceconts() {
        return admonConcecontsRepository.findAll();
    }

    @Override
    public void updateAdmonConceconts(Long id, AdmonConceconts admonConceconts) {
        AdmonConceconts admonConceconts1 = admonConcecontsRepository.findById(id).orElseThrow(()->new AdmonConcecontsNotFoundException("No se encuentra en el sistema"));
        admonConceconts.setId(id);
        admonConcecontsRepository.save(admonConceconts);
    }

    @Override
    public void deleteAdmonConceconts(Long id) {
        admonConcecontsRepository.deleteById(id);
    }
}
