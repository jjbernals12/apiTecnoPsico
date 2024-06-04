package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludCies;
import com.example.apiTecnoPsico.exception.SaludCiesNotFoundException;
import com.example.apiTecnoPsico.repository.SaludCiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaludCiesServiceImpl implements SaludCiesService{
    public final SaludCiesRepository saludCiesRepository;

    public SaludCiesServiceImpl(SaludCiesRepository saludCiesRepository) {
        this.saludCiesRepository = saludCiesRepository;
    }

    @Override
    public void createSaludCies(SaludCies saludCies) {
        saludCiesRepository.save(saludCies);
    }

    @Override
    public List<SaludCies> getAllSaludCies() {
        return saludCiesRepository.findAll();
    }

    @Override
    public void updateSaludCies(Long id, SaludCies saludCies) {
        SaludCies saludCies1 = saludCiesRepository.findById(id).orElseThrow(()->new SaludCiesNotFoundException("No se encuentra"));
        saludCies.setId(id);
        saludCiesRepository.save(saludCies);
    }

    @Override
    public void deleteSaludCies(Long id) {
        saludCiesRepository.deleteById(id);
    }
}
