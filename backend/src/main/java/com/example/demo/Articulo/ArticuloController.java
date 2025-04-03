package com.example.demo.Articulo;

import java.util.Optional;

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
        Optional<Articulo> articulo = articuloService.getArticulo(id);

        if (articulo.isPresent()) {
            return new ResponseEntity<>(articulo.get(), HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Articulo> updateArticulo(@PathVariable String id, @RequestBody Articulo request) {
        Optional<Articulo> updatedArticulo = articuloService.updateArticulo(id, request);

        if (updatedArticulo != null) {
            return new ResponseEntity<>(updatedArticulo.get(), HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
