package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.SaludEgreso;
import com.example.apiTecnoPsico.repository.SaludEgresoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaludEgresoServiceImpl implements SaludEgresoService{
    private final SaludEgresoRepository saludEgresoRepository;

    public SaludEgresoServiceImpl(SaludEgresoRepository saludEgresoRepository) {
        this.saludEgresoRepository = saludEgresoRepository;
    }

    @Override
    public void createEgreso(SaludEgreso saludEgreso) {
        saludEgresoRepository.save(saludEgreso);
    }

    @Override
    public List<SaludEgreso> getAllEgreso() {
        return saludEgresoRepository.findAll();
    }

    @Override
    public void updateEgreso(Long id, SaludEgreso saludEgreso) {
        SaludEgreso saludEgreso1 = saludEgresoRepository.findById(id).orElseThrow(()->new RuntimeException("No se encuentra"));
        saludEgreso.setId(id);
        saludEgresoRepository.save(saludEgreso);
    }

    @Override
    public void deleteEgreso(Long id) {
        saludEgresoRepository.deleteById(id);
    }
}
