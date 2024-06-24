package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludEgreso;
import com.example.apiTecnoPsico.service.SaludEgresoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/egreso")
public class SaludEgresoController {
    private final SaludEgresoServiceImpl saludEgresoService;

    public SaludEgresoController(SaludEgresoServiceImpl saludEgresoService) {
        this.saludEgresoService = saludEgresoService;
    }

    @GetMapping
    public List<SaludEgreso> getAllEgreso(){ return saludEgresoService.getAllEgreso(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearEgreso(@RequestBody SaludEgreso saludEgreso) { saludEgresoService.createEgreso(saludEgreso); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEgreso( @PathVariable Long id, @RequestBody SaludEgreso saludEgreso ) { saludEgresoService.updateEgreso(id, saludEgreso); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEgreso ( @PathVariable Long id ) { saludEgresoService.deleteEgreso(id); }
}
