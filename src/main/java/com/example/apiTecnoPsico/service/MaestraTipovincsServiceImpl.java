package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraTipovincs;
import com.example.apiTecnoPsico.exception.MaestraTipovincsNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraTipovincsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraTipovincsServiceImpl implements MaestraTipovincsService{
    public final MaestraTipovincsRepository maestraTipovincsRepository;

    public MaestraTipovincsServiceImpl(MaestraTipovincsRepository maestraTipovincsRepository) {
        this.maestraTipovincsRepository = maestraTipovincsRepository;
    }

    @Override
    public void createMaestraTipovincs(MaestraTipovincs maestraTipovincs) {
        maestraTipovincsRepository.save(maestraTipovincs);
    }

    @Override
    public List<MaestraTipovincs> getAllMaestraTipovincs() {
        return maestraTipovincsRepository.findAll();
    }

    @Override
    public void updateMaestraTipovincs(Long id, MaestraTipovincs maestraTipovincs) {
        MaestraTipovincs maestraTipovincs1 = maestraTipovincsRepository.findById(id).orElseThrow(()->new MaestraTipovincsNotFoundException("No se encuentra"));
        maestraTipovincs.setId(id);
        maestraTipovincsRepository.save(maestraTipovincs);
    }

    @Override
    public void deleteMaestraTipovincs(Long id) {
        maestraTipovincsRepository.deleteById(id);
    }
}
