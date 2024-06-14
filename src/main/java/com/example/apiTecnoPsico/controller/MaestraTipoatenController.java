package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraTipoaten;
import com.example.apiTecnoPsico.service.MaestraTipoatenServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoaten")
public class MaestraTipoatenController {
    private final MaestraTipoatenServiceImpl maestraTipoatenService;

    public MaestraTipoatenController(MaestraTipoatenServiceImpl maestraTipoatenService) {
        this.maestraTipoatenService = maestraTipoatenService;
    }
    @GetMapping
    public List<MaestraTipoaten> getAllTipoaten(){ return maestraTipoatenService.getAllTipoaten(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearTipoaten(@RequestBody MaestraTipoaten maestraTipoaten) { maestraTipoatenService.createTipoaten(maestraTipoaten); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTipoaten( @PathVariable Long id, @RequestBody MaestraTipoaten maestraTipoaten ) { maestraTipoatenService.updateTipoaten(id, maestraTipoaten); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTipoaten ( @PathVariable Long id ) { maestraTipoatenService.deleteTipoaten(id); }
}
