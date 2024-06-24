package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludCups;
import com.example.apiTecnoPsico.service.SaludCupsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cups")
public class SaludCupsController {
    private final SaludCupsServiceImpl saludCupsService;

    public SaludCupsController(SaludCupsServiceImpl saludCupsService) {
        this.saludCupsService = saludCupsService;
    }
    @GetMapping
    public List<SaludCups> getAllCups(){ return saludCupsService.getAllCups(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearCups(@RequestBody SaludCups saludCups) { saludCupsService.createCups(saludCups); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCups( @PathVariable Long id, @RequestBody SaludCups saludCups ) { saludCupsService.updateCups(id, saludCups); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCups ( @PathVariable Long id ) { saludCupsService.deleteCups(id); }
}
