package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludTarifas;
import com.example.apiTecnoPsico.service.SaludTarifasServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarifas")
public class SaludTarifasController {
    private final SaludTarifasServiceImpl saludTarifasService;

    public SaludTarifasController(SaludTarifasServiceImpl saludTarifasService) {
        this.saludTarifasService = saludTarifasService;
    }
    @GetMapping
    public List<SaludTarifas> getAllTarifas(){ return saludTarifasService.getAlLTarifas(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearSaludTarifas(@RequestBody SaludTarifas saludTarifas) { saludTarifasService.createTarifa(saludTarifas); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateSaludTarifas( @PathVariable Long id, @RequestBody SaludTarifas saludTarifas ) { saludTarifasService.updateTarifas(id, saludTarifas); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSaludTarifas ( @PathVariable Long id ) { saludTarifasService.deleteTarifas(id); }
}
