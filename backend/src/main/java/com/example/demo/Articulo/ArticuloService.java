package com.example.demo.Articulo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    public Articulo getArticulo(String id) {
        return articuloRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id. de artículo no encontrado: " + id));
    }

    public Articulo updateArticulo(String id, Articulo request) {
        Articulo articulo = articuloRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id. de artículo no encontrado: " + id));
        articulo.setDescripcion(request.getDescripcion());
        articulo.setModelo(request.getModelo());
        articuloRepository.save(articulo);

        return articuloRepository.findById(id).orElseThrow(RuntimeException::new);
    }

}
