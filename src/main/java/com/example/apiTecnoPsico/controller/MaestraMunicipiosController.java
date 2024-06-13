package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraMunicipios;
import com.example.apiTecnoPsico.service.MaestraMunicipiosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/municipio")
public class MaestraMunicipiosController {
    private final MaestraMunicipiosServiceImpl maestraMunicipiosService;

    public MaestraMunicipiosController(MaestraMunicipiosServiceImpl maestraMunicipiosService) {
        this.maestraMunicipiosService = maestraMunicipiosService;
    }
    @GetMapping
    public List<MaestraMunicipios> getAllMunicipios(){ return maestraMunicipiosService.getAllMunicipios(); }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMunicipio(@RequestBody MaestraMunicipios maestraMunicipios, @PathVariable Long id) { maestraMunicipiosService.createMunicipio(maestraMunicipios, id); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateMunicipio( @PathVariable Long id, @RequestBody MaestraMunicipios maestraMunicipios ) { maestraMunicipiosService.updateMunicipio(id, maestraMunicipios); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMunicipio ( @PathVariable Long id ) { maestraMunicipiosService.deleteMunicipio(id); }
}
