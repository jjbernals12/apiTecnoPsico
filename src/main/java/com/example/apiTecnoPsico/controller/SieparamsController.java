package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.Sieparams;
import com.example.apiTecnoPsico.service.SieParamsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sieparams")
public class SieparamsController {
    private final SieParamsServiceImpl sieParamsService;

    public SieparamsController(SieParamsServiceImpl sieParamsService) {
        this.sieParamsService = sieParamsService;
    }
    @GetMapping
    public List<Sieparams> getAllSieparams(){ return sieParamsService.getAllSieParams(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearSieParams(@RequestBody Sieparams sieparams) { sieParamsService.createSieParams(sieparams); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateSieparams( @PathVariable Long id, @RequestBody Sieparams sieparams ) { sieParamsService.updateSieParams(id, sieparams); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSieparams ( @PathVariable Long id ) { sieParamsService.deleteSieParams(id); }
}
