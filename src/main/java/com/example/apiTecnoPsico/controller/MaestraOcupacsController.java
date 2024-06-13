package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraOcupacs;
import com.example.apiTecnoPsico.service.MaestraOcupacsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocupacs")
public class MaestraOcupacsController {
    private final MaestraOcupacsServiceImpl maestraOcupacsService;

    public MaestraOcupacsController(MaestraOcupacsServiceImpl maestraOcupacsService) {
        this.maestraOcupacsService = maestraOcupacsService;
    }
    @GetMapping
    public List<MaestraOcupacs> getAllOcupacs(){ return maestraOcupacsService.getAllMaestraOcupacs(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearOcupacs(@RequestBody MaestraOcupacs maestraOcupacs) { maestraOcupacsService.createMaestraOcupacs(maestraOcupacs); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateOcupacs( @PathVariable Long id, @RequestBody MaestraOcupacs maestraOcupacs ) { maestraOcupacsService.updateMaestraOcupacs(id, maestraOcupacs); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOcupacs ( @PathVariable Long id ) { maestraOcupacsService.deleteMaestraOcupacs(id); }
}
