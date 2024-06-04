package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.Sieparams;
import com.example.apiTecnoPsico.exception.SieparamsNotFoundException;
import com.example.apiTecnoPsico.repository.SieparamsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SieParamsServiceImpl implements SieParamsService{
    public final SieparamsRepository sieparamsRepository;

    public SieParamsServiceImpl(SieparamsRepository sieparamsRepository) {
        this.sieparamsRepository = sieparamsRepository;
    }

    @Override
    public void createSieParams(Sieparams sieparams) {
        sieparamsRepository.save(sieparams);
    }

    @Override
    public List<Sieparams> getAllSieParams() {
        return sieparamsRepository.findAll();
    }

    @Override
    public void updateSieParams(Long id, Sieparams sieParams) {
        Sieparams sieparams = sieparamsRepository.findById(id).orElseThrow(()->new SieparamsNotFoundException("No se encuentra"));
        sieParams.setId(id);
        sieparamsRepository.save(sieParams);
    }

    @Override
    public void deleteSieParams(Long id) {
        sieparamsRepository.deleteById(id);
    }
}
