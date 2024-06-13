package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.Faseaten;
import com.example.apiTecnoPsico.service.FaseatenServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faseaten")
public class FaseatenController {
    private final FaseatenServiceImpl faseatenService;

    public FaseatenController(FaseatenServiceImpl faseatenService) {
        this.faseatenService = faseatenService;
    }
    @GetMapping
    public List<Faseaten> getAllFaseaten(){ return faseatenService.getAllFaseaten(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearFaseaten(@RequestBody Faseaten faseaten) { faseatenService.createFaseaten(faseaten); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFaseaten( @PathVariable Long id, @RequestBody Faseaten faseaten ) { faseatenService.updateFaseaten(id, faseaten); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFaseaten ( @PathVariable Long id ) { faseatenService.deleteFaseaten(id); }
}
