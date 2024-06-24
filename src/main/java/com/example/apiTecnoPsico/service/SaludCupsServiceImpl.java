package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludCups;
import com.example.apiTecnoPsico.repository.SaludCupsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaludCupsServiceImpl implements SaludCupsService{
    private final SaludCupsRepository saludCupsRepository;

    public SaludCupsServiceImpl(SaludCupsRepository saludCupsRepository) {
        this.saludCupsRepository = saludCupsRepository;
    }

    @Override
    public void createCups(SaludCups saludCups) {
        saludCupsRepository.save(saludCups);
    }

    @Override
    public List<SaludCups> getAllCups() {
        return saludCupsRepository.findAll();
    }

    @Override
    public void updateCups(Long id, SaludCups saludCups) {
        SaludCups saludCups1 = saludCupsRepository.findById(id).orElseThrow(()->new RuntimeException("No se encuentra"));
        saludCups.setId(id);
        saludCupsRepository.save(saludCups);
    }

    @Override
    public void deleteCups(Long id) {
        saludCupsRepository.deleteById(id);
    }
}
