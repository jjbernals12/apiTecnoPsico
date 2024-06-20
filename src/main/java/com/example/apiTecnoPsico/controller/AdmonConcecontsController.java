package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.AdmonConceconts;
import com.example.apiTecnoPsico.service.AdmonConcecontsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conceconts")
public class AdmonConcecontsController {
    private final AdmonConcecontsServiceImpl admonConcecontsService;

    public AdmonConcecontsController(AdmonConcecontsServiceImpl admonConcecontsService) {
        this.admonConcecontsService = admonConcecontsService;
    }
    @GetMapping
    public List<AdmonConceconts> getAllConceconts(){ return admonConcecontsService.getAllAdmonConceconts(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearConceconts(@RequestBody AdmonConceconts admonConceconts) { admonConcecontsService.createAdmonConceconts(admonConceconts); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateConceconts( @PathVariable Long id, @RequestBody AdmonConceconts admonConceconts ) { admonConcecontsService.updateAdmonConceconts(id, admonConceconts); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConceconts ( @PathVariable Long id ) { admonConcecontsService.deleteAdmonConceconts(id); }
}
