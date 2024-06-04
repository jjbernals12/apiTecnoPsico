package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludCupscapis;
import com.example.apiTecnoPsico.exception.SaludCupscapisNotFoundException;
import com.example.apiTecnoPsico.repository.SaludCupscapisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaludCupscapisServiceImpl implements SaludCupscapisService{
    public final SaludCupscapisRepository saludCupscapisRepository;

    public SaludCupscapisServiceImpl(SaludCupscapisRepository saludCupscapisRepository) {
        this.saludCupscapisRepository = saludCupscapisRepository;
    }

    @Override
    public void createSaludCupscapis(SaludCupscapis saludCupscapis) {
        saludCupscapisRepository.save(saludCupscapis);
    }

    @Override
    public List<SaludCupscapis> getAllSaludCupscapis() {
        return saludCupscapisRepository.findAll();
    }

    @Override
    public void updateSaludCupscapis(Long id, SaludCupscapis saludCupscapis) {
        SaludCupscapis saludCupscapis1 = saludCupscapisRepository.findById(id).orElseThrow(()->new SaludCupscapisNotFoundException("No se encuentra"));
        saludCupscapis.setId(id);
        saludCupscapisRepository.save(saludCupscapis);
    }

    @Override
    public void deleteSaludCupscapis(Long id) {
        saludCupscapisRepository.deleteById(id);
    }
}
