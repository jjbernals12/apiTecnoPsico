package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.AdmonPais;
import com.example.apiTecnoPsico.service.AdmonPaisServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class AdmonPaisController {
    private final AdmonPaisServiceImpl admonPaisService;

    public AdmonPaisController(AdmonPaisServiceImpl admonPaisService) {
        this.admonPaisService = admonPaisService;
    }
    @GetMapping
    public List<AdmonPais> getAllPais(){ return admonPaisService.getAllPais(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearPais(@RequestBody AdmonPais admonPais) { admonPaisService.createPais(admonPais); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePais( @PathVariable Long id, @RequestBody AdmonPais admonPais ) { admonPaisService.updatePais(id, admonPais); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePais ( @PathVariable Long id ) { admonPaisService.deletePais(id); }
}
