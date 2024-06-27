package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludMotivocan;
import com.example.apiTecnoPsico.repository.SaludMotivocanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaludMotivocanServiceImpl implements SaludMotivocanService{
    private final SaludMotivocanRepository saludMotivocanRepository;

    public SaludMotivocanServiceImpl(SaludMotivocanRepository saludMotivocanRepository) {
        this.saludMotivocanRepository = saludMotivocanRepository;
    }

    @Override
    public void createMotivocan(SaludMotivocan saludMotivocan) {
        saludMotivocanRepository.save(saludMotivocan);
    }

    @Override
    public List<SaludMotivocan> getAllMotivocan() {
        return saludMotivocanRepository.findAll();
    }

    @Override
    public void updateMotivocan(Long id, SaludMotivocan saludMotivocan) {
        SaludMotivocan saludMotivocan1 = saludMotivocanRepository.findById(id).orElseThrow(()->new RuntimeException("No se encontro"));
        saludMotivocan.setId(id);
        saludMotivocanRepository.save(saludMotivocan);
    }

    @Override
    public void deleteMotivocan(Long id) {
        saludMotivocanRepository.deleteById(id);
    }
}
