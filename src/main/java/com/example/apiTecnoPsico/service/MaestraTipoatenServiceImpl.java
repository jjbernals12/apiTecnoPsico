package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraTipoaten;
import com.example.apiTecnoPsico.repository.MaestraTipoatenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraTipoatenServiceImpl implements MaestraTipoatenService{
    private final MaestraTipoatenRepository maestraTipoatenRepository;

    public MaestraTipoatenServiceImpl(MaestraTipoatenRepository maestraTipoatenRepository) {
        this.maestraTipoatenRepository = maestraTipoatenRepository;
    }

    @Override
    public void createTipoaten(MaestraTipoaten maestraTipoaten) {
        maestraTipoatenRepository.save(maestraTipoaten);
    }

    @Override
    public List<MaestraTipoaten> getAllTipoaten() {
        return maestraTipoatenRepository.findAll();
    }

    @Override
    public void updateTipoaten(Long id, MaestraTipoaten maestraTipoaten) {
        MaestraTipoaten maestraTipoaten1 = maestraTipoatenRepository.findById(id).orElseThrow(()->new RuntimeException("No se encontro el tipo de atencion"));
        maestraTipoaten.setId(id);
        maestraTipoatenRepository.save(maestraTipoaten);
    }

    @Override
    public void deleteTipoaten(Long id) {
        maestraTipoatenRepository.deleteById(id);
    }
}
