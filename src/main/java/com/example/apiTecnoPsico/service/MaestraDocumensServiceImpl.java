package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraDocumens;
import com.example.apiTecnoPsico.exception.MaestraDocumensNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraDocumensRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraDocumensServiceImpl implements MaestraDocumensService{
    public final MaestraDocumensRepository maestraDocumensRepository;

    public MaestraDocumensServiceImpl(MaestraDocumensRepository maestraDocumensRepository) {
        this.maestraDocumensRepository = maestraDocumensRepository;
    }

    @Override
    public void createMaestraDocumens(MaestraDocumens maestraDocumens) {
        maestraDocumensRepository.save(maestraDocumens);
    }

    @Override
    public List<MaestraDocumens> getAllMaestraDocumens() {
        return maestraDocumensRepository.findAll();
    }

    @Override
    public void updateMaestraDocumens(Long id, MaestraDocumens maestraDocumens) {
        MaestraDocumens maestraDocumens1 = maestraDocumensRepository.findById(id).orElseThrow(()->new MaestraDocumensNotFoundException("No se encuentra"));
        maestraDocumens.setId(id);
        maestraDocumensRepository.save(maestraDocumens);
    }

    @Override
    public void deleteMaestraDocumens(Long id) {
        maestraDocumensRepository.deleteById(id);
    }
}
