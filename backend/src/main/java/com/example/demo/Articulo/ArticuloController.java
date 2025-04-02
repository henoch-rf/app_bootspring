package com.example.demo.Articulo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/articulo")
@RequiredArgsConstructor
public class ArticuloController {

    private final ArticuloService articuloService;

    @GetMapping("/get/{id}")
    public Articulo getArticulo(@PathVariable String id) {
        return articuloService.getArticulo(id);
    }

    @PutMapping("/update/{id}")
    public void updatePersona(@PathVariable String id, @RequestBody Articulo request) {
        articuloService.updateArticulo(id, request);
    }

}
