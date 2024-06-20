package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.SaludHiselem;
import com.example.apiTecnoPsico.service.SaludHiselemServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hiselem")
public class SaludHiselemController {
    private final SaludHiselemServiceImpl saludHiselemService;

    public SaludHiselemController(SaludHiselemServiceImpl saludHiselemService) {
        this.saludHiselemService = saludHiselemService;
    }
    @GetMapping
    public List<SaludHiselem> getAllHiselem(){ return saludHiselemService.getAllSaludHiselem(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearHiselem(@RequestBody SaludHiselem saludHiselem) { saludHiselemService.createSaludHiselem(saludHiselem); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateHiselem( @PathVariable Long id, @RequestBody SaludHiselem saludHiselem ) { saludHiselemService.updateSaludHiselem(id, saludHiselem); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteHiselem ( @PathVariable Long id ) { saludHiselemService.deleteSaludHiselem(id); }
}
