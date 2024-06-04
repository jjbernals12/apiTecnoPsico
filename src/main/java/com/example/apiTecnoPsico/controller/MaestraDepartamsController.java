package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraDepartams;
import com.example.apiTecnoPsico.service.MaestraDepartamsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class MaestraDepartamsController {
    private final MaestraDepartamsServiceImpl maestraDepartamsService;

    public MaestraDepartamsController(MaestraDepartamsServiceImpl maestraDepartamsService) {
        this.maestraDepartamsService = maestraDepartamsService;
    }
    @GetMapping
    public List<MaestraDepartams> getAllDepartams(){ return maestraDepartamsService.getAllMaestraDepartams(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearDepartam(@RequestBody MaestraDepartams maestraDepartams) { maestraDepartamsService.createMaestraDepartams(maestraDepartams); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDepartam( @PathVariable Long id, @RequestBody MaestraDepartams maestraDepartams ) { maestraDepartamsService.updateMaestraDepartams(id, maestraDepartams); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDepartam ( @PathVariable Long id ) { maestraDepartamsService.deleteMaestraDepartams(id); }
}
