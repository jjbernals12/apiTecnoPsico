package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludHisplanti;
import com.example.apiTecnoPsico.service.SaludHisplantiServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hisplanti")
public class SaludHisplantiController {
    private final SaludHisplantiServiceImpl saludHisplantiService;

    public SaludHisplantiController(SaludHisplantiServiceImpl saludHisplantiService) {
        this.saludHisplantiService = saludHisplantiService;
    }
    @GetMapping
    public List<SaludHisplanti> getAllHisplanti(){ return saludHisplantiService.getAllSaludHisplanti(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearHisplanti (@RequestBody SaludHisplanti saludHisplanti) { saludHisplantiService.createSaludHisplanti(saludHisplanti); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateHisplanti ( @PathVariable Long id, @RequestBody SaludHisplanti saludHisplanti ) { saludHisplantiService.updateSaludHisplanti(id, saludHisplanti); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHisplanti ( @PathVariable Long id ) { saludHisplantiService.deleteSaludHisplanti(id); }
}
