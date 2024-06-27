package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.AdmonClientes;
import com.example.apiTecnoPsico.repository.AdmonClientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmonClientesServiceImpl implements AdmonClientesService{
    private final AdmonClientesRepository admonClientesRepository;

    public AdmonClientesServiceImpl(AdmonClientesRepository admonClientesRepository) {
        this.admonClientesRepository = admonClientesRepository;
    }

    @Override
    public void createCliente(AdmonClientes admonClientes) {
        admonClientesRepository.save(admonClientes);
    }

    @Override
    public List<AdmonClientes> getAllClientes() {
        return admonClientesRepository.findAll();
    }

    @Override
    public void updateCliente(Long id, AdmonClientes admonClientes) {
        AdmonClientes admonClientes1 = admonClientesRepository.findById(id).orElseThrow(()->new RuntimeException("No se encontro el cliente"));
        admonClientes.setId(id);
        admonClientesRepository.save(admonClientes);
    }

    @Override
    public void deleteCliente(Long id) {
        admonClientesRepository.deleteById(id);
    }
}
