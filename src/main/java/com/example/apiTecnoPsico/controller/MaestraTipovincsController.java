package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraTipovincs;
import com.example.apiTecnoPsico.service.MaestraTipovincsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipovincs")
public class MaestraTipovincsController {
    private final MaestraTipovincsServiceImpl maestraTipovincsService;

    public MaestraTipovincsController(MaestraTipovincsServiceImpl maestraTipovincsService) {
        this.maestraTipovincsService = maestraTipovincsService;
    }
    @GetMapping
    public List<MaestraTipovincs> getAllTipovincs(){ return maestraTipovincsService.getAllMaestraTipovincs(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearTipovincs(@RequestBody MaestraTipovincs maestraTipovincs) { maestraTipovincsService.createMaestraTipovincs(maestraTipovincs); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTipovincs( @PathVariable Long id, @RequestBody MaestraTipovincs maestraTipovincs ) { maestraTipovincsService.updateMaestraTipovincs(id, maestraTipovincs); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTipovincs ( @PathVariable Long id ) { maestraTipovincsService.deleteMaestraTipovincs(id); }
}
