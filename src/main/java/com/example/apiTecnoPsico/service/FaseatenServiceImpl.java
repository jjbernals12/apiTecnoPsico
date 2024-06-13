package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.Faseaten;
import com.example.apiTecnoPsico.repository.FaseatenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FaseatenServiceImpl implements FaseatenService{
    private final FaseatenRepository faseatenRepository;

    public FaseatenServiceImpl(FaseatenRepository faseatenRepository) {
        this.faseatenRepository = faseatenRepository;
    }


    @Override
    public void createFaseaten(Faseaten faseaten) {
        faseatenRepository.save(faseaten);
    }

    @Override
    public List<Faseaten> getAllFaseaten() {
        return faseatenRepository.findAll();
    }

    @Override
    public void updateFaseaten(Long id, Faseaten faseaten) {
        Faseaten faseaten1 = faseatenRepository.findById(id).orElseThrow(()-> new RuntimeException("No se encontro el registro buscado"));
        faseaten.setId(id);
        faseatenRepository.save(faseaten);
    }

    @Override
    public void deleteFaseaten(Long id) {
        faseatenRepository.deleteById(id);
    }
}
