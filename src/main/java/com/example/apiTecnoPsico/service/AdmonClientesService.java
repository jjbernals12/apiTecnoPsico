package com.example.apiTecnoPsico.service;

import com.example.apiTecnoPsico.entity.AdmonClientes;

import java.util.List;

public interface AdmonClientesService {
    void createCliente (AdmonClientes admonClientes);
    List<AdmonClientes> getAllClientes ();
    void updateCliente (Long id, AdmonClientes admonClientes);
    void deleteCliente (Long id);
}
