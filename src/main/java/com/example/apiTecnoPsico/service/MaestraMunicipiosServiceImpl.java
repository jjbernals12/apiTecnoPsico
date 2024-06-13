package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraDepartams;
import com.example.apiTecnoPsico.entity.MaestraMunicipios;
import com.example.apiTecnoPsico.repository.MaestraDepartamsRepository;
import com.example.apiTecnoPsico.repository.MaestraMunicipiosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraMunicipiosServiceImpl implements MaestraMunicipiosService{
    private final MaestraMunicipiosRepository maestraMunicipiosRepository;
    private final MaestraDepartamsRepository maestraDepartamsRepository;

    public MaestraMunicipiosServiceImpl(MaestraMunicipiosRepository maestraMunicipiosRepository, MaestraDepartamsRepository maestraDepartamsRepository) {
        this.maestraMunicipiosRepository = maestraMunicipiosRepository;
        this.maestraDepartamsRepository = maestraDepartamsRepository;
    }

    @Override
    public void createMunicipio(MaestraMunicipios maestraMunicipios, Long id) {
        MaestraDepartams maestraDepartams1 = maestraDepartamsRepository.findById(id).orElseThrow(()->new RuntimeException("No se encuentra este departamento"));
        maestraMunicipios.setCodigo(maestraDepartams1.getCodigo()+maestraMunicipios.getCod_muni());
        maestraMunicipios.setIddpto(maestraDepartams1);
        maestraMunicipiosRepository.save(maestraMunicipios);
    }

    @Override
    public List<MaestraMunicipios> getAllMunicipios() {
        return maestraMunicipiosRepository.findAll();
    }

    @Override
    public void updateMunicipio(Long id, MaestraMunicipios maestraMunicipios) {
        MaestraMunicipios maestraMunicipios1 = maestraMunicipiosRepository.findById(id).orElseThrow(()->new RuntimeException("No se encontro el municipio"));
        maestraMunicipios.setId(id);
        maestraMunicipiosRepository.save(maestraMunicipios);
    }

    @Override
    public void deleteMunicipio(Long id) {
        maestraMunicipiosRepository.deleteById(id);
    }
}
