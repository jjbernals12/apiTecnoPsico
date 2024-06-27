package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraDocumens;
import com.example.apiTecnoPsico.service.MaestraDocumensServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documens")
public class MaestraDocumensController {
    private final MaestraDocumensServiceImpl maestraDocumensService;

    public MaestraDocumensController(MaestraDocumensServiceImpl maestraDocumensService) {
        this.maestraDocumensService = maestraDocumensService;
    }
    @GetMapping
    public List<MaestraDocumens> getAllDocumens(){ return maestraDocumensService.getAllMaestraDocumens(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearDocumens(@RequestBody MaestraDocumens maestraDocumens) { maestraDocumensService.createMaestraDocumens(maestraDocumens); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDocumens( @PathVariable Long id, @RequestBody MaestraDocumens maestraDocumens ) { maestraDocumensService.updateMaestraDocumens(id, maestraDocumens); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDocumens ( @PathVariable Long id ) { maestraDocumensService.deleteMaestraDocumens(id); }
}
