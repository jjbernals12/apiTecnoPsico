package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludRipcons;
import com.example.apiTecnoPsico.service.SaludRipconsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ripcons")
public class SaludRipconsController {
    private final SaludRipconsServiceImpl saludRipconsService;

    public SaludRipconsController(SaludRipconsServiceImpl saludRipconsService) {
        this.saludRipconsService = saludRipconsService;
    }
    @GetMapping
    public List<SaludRipcons> getAllRipcons(){ return saludRipconsService.getAllRipcons(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearSaludRipcons(@RequestBody SaludRipcons saludRipcons) { saludRipconsService.createRipcons(saludRipcons); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateSaludRipcons( @PathVariable Long id, @RequestBody SaludRipcons saludRipcons ) { saludRipconsService.updateRipcons(id, saludRipcons); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSaludRipcons ( @PathVariable Long id ) { saludRipconsService.deleteRipcons(id); }
}
