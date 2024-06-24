package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludTarifas;
import com.example.apiTecnoPsico.repository.SaludTarifasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaludTarifasServiceImpl implements SaludTarifasService{
    private final SaludTarifasRepository saludTarifasRepository;

    public SaludTarifasServiceImpl(SaludTarifasRepository saludTarifasRepository) {
        this.saludTarifasRepository = saludTarifasRepository;
    }

    @Override
    public void createTarifa(SaludTarifas saludTarifas) {
        saludTarifasRepository.save(saludTarifas);
    }

    @Override
    public List<SaludTarifas> getAlLTarifas() {
        return saludTarifasRepository.findAll();
    }

    @Override
    public void updateTarifas(Long id, SaludTarifas saludTarifas) {
        SaludTarifas saludTarifas1 = saludTarifasRepository.findById(id).orElseThrow(()->new RuntimeException("No se encuentra"));
        saludTarifas.setId(id);
        saludTarifasRepository.save(saludTarifas);
    }

    @Override
    public void deleteTarifas(Long id) {
        saludTarifasRepository.deleteById(id);
    }
}
