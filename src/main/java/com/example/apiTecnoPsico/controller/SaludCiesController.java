package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludCies;
import com.example.apiTecnoPsico.service.SaludCiesServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cies")
public class SaludCiesController {
    private final SaludCiesServiceImpl saludCiesService;

    public SaludCiesController(SaludCiesServiceImpl saludCiesService) {
        this.saludCiesService = saludCiesService;
    }
    @GetMapping
    public List<SaludCies> getAllCies(){ return saludCiesService.getAllSaludCies(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearCies(@RequestBody SaludCies saludCies) { saludCiesService.createSaludCies(saludCies); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCies( @PathVariable Long id, @RequestBody SaludCies saludCies ) { saludCiesService.updateSaludCies(id, saludCies); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCies ( @PathVariable Long id ) { saludCiesService.deleteSaludCies(id); }
}
