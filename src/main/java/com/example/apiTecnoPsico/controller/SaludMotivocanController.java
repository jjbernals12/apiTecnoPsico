package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludMotivocan;
import com.example.apiTecnoPsico.service.SaludMotivocanServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motivocan")
public class SaludMotivocanController {
    private final SaludMotivocanServiceImpl saludMotivocanService;

    public SaludMotivocanController(SaludMotivocanServiceImpl saludMotivocanService) {
        this.saludMotivocanService = saludMotivocanService;
    }
    @GetMapping
    public List<SaludMotivocan> getAllMotivocan(){ return saludMotivocanService.getAllMotivocan(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearSaludMotivocan(@RequestBody SaludMotivocan saludMotivocan) { saludMotivocanService.createMotivocan(saludMotivocan); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateSaludMotivocan( @PathVariable Long id, @RequestBody SaludMotivocan saludMotivocan ) { saludMotivocanService.updateMotivocan(id, saludMotivocan); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSaludMotivocan ( @PathVariable Long id ) { saludMotivocanService.deleteMotivocan(id); }
}
