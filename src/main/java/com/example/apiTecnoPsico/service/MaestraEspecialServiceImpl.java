package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraEspecial;
import com.example.apiTecnoPsico.exception.MaestraEspecialNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraEspecialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaestraEspecialServiceImpl implements MaestraEspecialService{
    public final MaestraEspecialRepository maestraEspecialRepository;

    public MaestraEspecialServiceImpl(MaestraEspecialRepository maestraEspecialRepository) {
        this.maestraEspecialRepository = maestraEspecialRepository;
    }

    @Override
    public void createMaestraEspecial(MaestraEspecial maestraEspecial) {
        maestraEspecialRepository.save(maestraEspecial);
    }

    @Override
    public List<MaestraEspecial> getAllMaestraEspecial() {
        return maestraEspecialRepository.findAll();
    }

    @Override
    public void updateMaestraEspecial(Long id, MaestraEspecial maestraEspecial) {
        MaestraEspecial maestraEspecial1 = maestraEspecialRepository.findById(id).orElseThrow(()->new MaestraEspecialNotFoundException("No se encuentra"));
        maestraEspecial.setId(id);
        maestraEspecialRepository.save(maestraEspecial);
    }

    @Override
    public void deleteMaestraEspecial(Long id) {
        maestraEspecialRepository.deleteById(id);
    }
}
