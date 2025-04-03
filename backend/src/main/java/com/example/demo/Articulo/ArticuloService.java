package com.example.demo.Articulo;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticuloService {

    private final ArticuloRepository articuloRepository;

    public Optional<Articulo> getArticulo(String id) {
        return articuloRepository.findById(id);
    }

    public Optional<Articulo> updateArticulo(String id, Articulo request) {
        Optional<Articulo> articulo = articuloRepository.findById(id);

        if (articulo.isPresent()) {
            Articulo updateArticulo = articulo.get();
            updateArticulo.setDescripcion(request.getDescripcion());
            updateArticulo.setModelo(request.getModelo());
            articuloRepository.save(updateArticulo);
            return articuloRepository.findById(updateArticulo.getId());
        }
        return null;
    }

}
