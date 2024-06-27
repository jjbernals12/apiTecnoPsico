package com.example.apiTecnoPsico.controller;

import com.example.apiTecnoPsico.entity.MaestraEps;
import com.example.apiTecnoPsico.service.MaestraEpsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eps")
public class MaestraEpsController {
    private final MaestraEpsServiceImpl maestraEpsService;

    public MaestraEpsController(MaestraEpsServiceImpl maestraEpsService) {
        this.maestraEpsService = maestraEpsService;
    }
    @GetMapping
    public List<MaestraEps> getAllEps(){ return maestraEpsService.getAllMaestraEps(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearEps(@RequestBody MaestraEps maestraEps) { maestraEpsService.createMaestraEps(maestraEps); }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEps( @PathVariable Long id, @RequestBody MaestraEps maestraEps ) { maestraEpsService.updateMaestraEps(id, maestraEps); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEps ( @PathVariable Long id ) { maestraEpsService.deleteMaestraEps(id); }
}
