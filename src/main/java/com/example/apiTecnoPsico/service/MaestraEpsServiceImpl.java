package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.MaestraEps;
import com.example.apiTecnoPsico.exception.MaestraEpsNotFoundException;
import com.example.apiTecnoPsico.repository.MaestraEpsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaestraEpsServiceImpl implements MaestraEpsService{
    public final MaestraEpsRepository maestraEpsRepository;

    public MaestraEpsServiceImpl(MaestraEpsRepository maestraEpsRepository) {
        this.maestraEpsRepository = maestraEpsRepository;
    }

    @Override
    public void createMaestraEps(MaestraEps maestraEps) {
        maestraEpsRepository.save(maestraEps);
    }

    @Override
    public List<MaestraEps> getAllMaestraEps() {
        return maestraEpsRepository.findAll();
    }

    @Override
    public void updateMaestraEps(Long id, MaestraEps maestraEps) {
        MaestraEps maestraEps1 = maestraEpsRepository.findById(id).orElseThrow(()->new MaestraEpsNotFoundException("No se encuentra"));
        maestraEps.setId(id);
        maestraEpsRepository.save(maestraEps);
    }

    @Override
    public void deleteMaestraEps(Long id) {
        maestraEpsRepository.deleteById(id);
    }
}
