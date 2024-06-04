package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraOcupacs;
import com.example.apiTecnoPsico.exception.MaestraOcupacsNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraOcupacsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraOcupacsServiceImpl implements  MaestraOcupacsService{
    public final MaestraOcupacsRepository maestraOcupacsRepository;

    public MaestraOcupacsServiceImpl(MaestraOcupacsRepository maestraOcupacsRepository) {
        this.maestraOcupacsRepository = maestraOcupacsRepository;
    }

    @Override
    public void createMaestraOcupacs(MaestraOcupacs maestraOcupacs) {
        maestraOcupacsRepository.save(maestraOcupacs);
    }

    @Override
    public List<MaestraOcupacs> getAllMaestraOcupacs() {
        return maestraOcupacsRepository.findAll();
    }

    @Override
    public void updateMaestraOcupacs(Long id, MaestraOcupacs maestraOcupacs) {
        MaestraOcupacs maestraOcupacs1 = maestraOcupacsRepository.findById(id).orElseThrow(()->new MaestraOcupacsNotFoundException("No se encuentra"));
        maestraOcupacs.setId(id);
        maestraOcupacsRepository.save(maestraOcupacs);
    }

    @Override
    public void deleteMaestraOcupacs(Long id) {
        maestraOcupacsRepository.deleteById(id);
    }
}
