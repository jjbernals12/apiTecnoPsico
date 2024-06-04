package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraEstratos;
import com.example.apiTecnoPsico.exception.MaestraEstratosNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraEstratosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraEstratosServiceImpl implements MaestraEstratosService{
    public final MaestraEstratosRepository maestraEstratosRepository;

    public MaestraEstratosServiceImpl(MaestraEstratosRepository maestraEstratosRepository) {
        this.maestraEstratosRepository = maestraEstratosRepository;
    }

    @Override
    public void createMaestraEstratos(MaestraEstratos maestraEstratos) {
        maestraEstratosRepository.save(maestraEstratos);
    }

    @Override
    public List<MaestraEstratos> getAllMaestraEstratos() {
        return maestraEstratosRepository.findAll();
    }

    @Override
    public void updateMaestraEstratos(Long id, MaestraEstratos maestraEstratos) {
        MaestraEstratos maestraEstratos1 = maestraEstratosRepository.findById(id).orElseThrow(()->new MaestraEstratosNotFoundException("No se encuentra"));
        maestraEstratos.setId(id);
        maestraEstratosRepository.save(maestraEstratos);
    }

    @Override
    public void deleteMaestraEstratos(Long id) {
        maestraEstratosRepository.deleteById(id);
    }
}
