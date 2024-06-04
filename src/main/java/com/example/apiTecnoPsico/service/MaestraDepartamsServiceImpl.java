package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraDepartams;
import com.example.apiTecnoPsico.exception.MaestraDepartamsNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraDepartamsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraDepartamsServiceImpl implements MaestraDepartamsService{
    public final MaestraDepartamsRepository maestraDepartamsRepository;

    public MaestraDepartamsServiceImpl(MaestraDepartamsRepository maestraDepartamsRepository) {
        this.maestraDepartamsRepository = maestraDepartamsRepository;
    }

    @Override
    public void createMaestraDepartams(MaestraDepartams maestraDepartams) {
        maestraDepartamsRepository.save(maestraDepartams);
    }

    @Override
    public List<MaestraDepartams> getAllMaestraDepartams() {
        return maestraDepartamsRepository.findAll();
    }

    @Override
    public void updateMaestraDepartams(Long id, MaestraDepartams maestraDepartams) {
        MaestraDepartams maestraDepartams1 = maestraDepartamsRepository.findById(id).orElseThrow(()->new MaestraDepartamsNotFoundException("No se encuentra"));
        maestraDepartams.setId(id);
        maestraDepartamsRepository.save(maestraDepartams);
    }

    @Override
    public void deleteMaestraDepartams(Long id) {
        maestraDepartamsRepository.deleteById(id);
    }
}
