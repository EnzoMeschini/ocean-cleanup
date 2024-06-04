package com.ocean.cleanup.controller;

import com.ocean.cleanup.model.Lixo;
import com.ocean.cleanup.service.LixoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lixos")
public class LixoController {

    @Autowired
    private LixoService lixoService;

    @GetMapping
    public List<Lixo> getAllLixos() {
        return lixoService.getAllLixos();
    }

    @PostMapping
    public Lixo createLixo(@RequestBody Lixo lixo) {
        return lixoService.saveLixo(lixo);
    }

    @DeleteMapping("/{id}")
    public void deleteLixo(@PathVariable Long id) {
        lixoService.deleteLixo(id);
    }
}
