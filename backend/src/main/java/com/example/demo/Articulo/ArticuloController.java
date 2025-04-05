package com.example.demo.Articulo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Articulo> getArticulo(@PathVariable String id) {

        Articulo articulo = articuloService.getArticulo(id);

        if (articulo == null) {
            return ResponseEntity.notFound().build();
        } else {
            return new ResponseEntity<Articulo>(articulo, HttpStatus.FOUND);
        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Articulo> updateArticulo(@PathVariable String id, @RequestBody Articulo request) {

        Articulo articulo = articuloService.getArticulo(id);

        if (articulo == null) {
            return ResponseEntity.notFound().build();
        } else {

            Articulo articuloUpdated = articuloService.updateArticulo(articulo, request);

            if (articuloUpdated == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return new ResponseEntity<Articulo>(articuloUpdated, HttpStatus.OK);
            }

        }

    }

}
