package com.backend.P2.controllers;

import com.backend.P2.entities.Imovel;
import com.backend.P2.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/imoveis")
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @GetMapping
    public Iterable<Imovel> getAllImoveis() {
        return imovelService.getAllImoveis();
    }

    @PostMapping
    public Imovel createImovel(@RequestBody Imovel imovel) {
        return imovelService.saveImovel(imovel);
    }

    @DeleteMapping("/{id}")
    public void deleteImovel(@PathVariable Long id) {
        imovelService.deleteImovel(id);
    }
}
