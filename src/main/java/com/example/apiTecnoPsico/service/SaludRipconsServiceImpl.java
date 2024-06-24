package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludRipcons;
import com.example.apiTecnoPsico.repository.SaludRipconsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaludRipconsServiceImpl implements SaludRipconsService{
    private final SaludRipconsRepository saludRipconsRepository;

    public SaludRipconsServiceImpl(SaludRipconsRepository saludRipconsRepository) {
        this.saludRipconsRepository = saludRipconsRepository;
    }

    @Override
    public void createRipcons(SaludRipcons saludRipcons) {
        saludRipconsRepository.save(saludRipcons);
    }

    @Override
    public List<SaludRipcons> getAllRipcons() {
        return saludRipconsRepository.findAll();
    }

    @Override
    public void updateRipcons(Long id, SaludRipcons saludRipcons) {
        SaludRipcons saludRipcons1 = saludRipconsRepository.findById(id).orElseThrow(()->new RuntimeException("No se encuentra"));
        saludRipcons.setId(id);
        saludRipconsRepository.save(saludRipcons);
    }

    @Override
    public void deleteRipcons(Long id) {
        saludRipconsRepository.deleteById(id);
    }
}
