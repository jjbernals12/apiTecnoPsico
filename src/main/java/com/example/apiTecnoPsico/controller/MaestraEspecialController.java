package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraEspecial;
import com.example.apiTecnoPsico.service.MaestraEspecialServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especial")
public class MaestraEspecialController {
    private final MaestraEspecialServiceImpl maestraEspecialService;

    public MaestraEspecialController(MaestraEspecialServiceImpl maestraEspecialService) {
        this.maestraEspecialService = maestraEspecialService;
    }
    @GetMapping
    public List<MaestraEspecial> getAllEspecial(){ return maestraEspecialService.getAllMaestraEspecial(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearEspecial(@RequestBody MaestraEspecial maestraEspecial) { maestraEspecialService.createMaestraEspecial(maestraEspecial); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEspecial( @PathVariable Long id, @RequestBody MaestraEspecial maestraEspecial ) { maestraEspecialService.updateMaestraEspecial(id, maestraEspecial); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEspecial ( @PathVariable Long id ) { maestraEspecialService.deleteMaestraEspecial(id); }
}
