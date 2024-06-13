package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraEstratos;
import com.example.apiTecnoPsico.service.MaestraEstratosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estratos")
public class MaestraEstratosController {
    private final MaestraEstratosServiceImpl maestraEstratosService;

    public MaestraEstratosController(MaestraEstratosServiceImpl maestraEstratosService) {
        this.maestraEstratosService = maestraEstratosService;
    }
    @GetMapping
    public List<MaestraEstratos> getAllEstratos(){ return maestraEstratosService.getAllMaestraEstratos(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEstrato(@RequestBody MaestraEstratos maestraEstratos) { maestraEstratosService.createMaestraEstratos(maestraEstratos); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEstrato( @PathVariable Long id, @RequestBody MaestraEstratos maestraEstratos ) { maestraEstratosService.updateMaestraEstratos(id, maestraEstratos); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEstrato ( @PathVariable Long id ) { maestraEstratosService.deleteMaestraEstratos(id); }
}
