package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludManuales;
import com.example.apiTecnoPsico.service.SaludManualesServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manuales")
public class SaludManualesController {
    private final SaludManualesServiceImpl saludManualesService;

    public SaludManualesController(SaludManualesServiceImpl saludManualesService) {
        this.saludManualesService = saludManualesService;
    }
    @GetMapping
    public List<SaludManuales> getAllManuales(){ return saludManualesService.getAllSaludManuales(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearSaludManuales(@RequestBody SaludManuales saludManuales) { saludManualesService.createSaludManuales(saludManuales); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateSaludManuales( @PathVariable Long id, @RequestBody SaludManuales saludManuales ) { saludManualesService.updateSaludManuales(id, saludManuales); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSaludManuales ( @PathVariable Long id ) { saludManualesService.deleteSaludManuales(id); }
}
