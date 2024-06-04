package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraGrupserv;
import com.example.apiTecnoPsico.exception.MaestraGrupservNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraGrupservRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraGrupservServiceImpl implements MaestraGrupservService{
    public final MaestraGrupservRepository maestraGrupservRepository;

    public MaestraGrupservServiceImpl(MaestraGrupservRepository maestraGrupservRepository) {
        this.maestraGrupservRepository = maestraGrupservRepository;
    }

    @Override
    public void createMaestraGrupserv(MaestraGrupserv maestraGrupserv) {
        maestraGrupservRepository.save(maestraGrupserv);
    }

    @Override
    public List<MaestraGrupserv> getAllMaestraGrupserv() {
        return maestraGrupservRepository.findAll();
    }

    @Override
    public void updateMaestraGrupserv(Long id, MaestraGrupserv maestraGrupserv) {
        MaestraGrupserv maestraGrupserv1 = maestraGrupservRepository.findById(id).orElseThrow(()->new MaestraGrupservNotFoundException("No se encuentra"));
        maestraGrupserv.setId(id);
        maestraGrupservRepository.save(maestraGrupserv);
    }

    @Override
    public void deleteMaestraGrupserv(Long id) {
        maestraGrupservRepository.deleteById(id);
    }
}
