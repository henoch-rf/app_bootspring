package com.example.demo.Articulo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    public Articulo getArticulo(String id) {
        return articuloRepository.findById(id).orElse(null);
    }

    public Articulo updateArticulo(Articulo articulo, Articulo request) {

        articulo.setDescripcion(request.getDescripcion());
        articulo.setModelo(request.getModelo());

        try {
            return articuloRepository.save(articulo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }

    }

}
