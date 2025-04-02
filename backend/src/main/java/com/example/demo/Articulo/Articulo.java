package com.example.demo.Articulo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Articulo {
    @Id
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    @Size(max = 10)
    private String id;

    @Column(name = "nombre", updatable = false, nullable = false)
    @Size(max = 20)
    private String nombre;

    @Column(name = "descripcion", updatable = true, nullable = false)
    @Size(max = 200)
    private String descripcion;

    @Column(name = "precio", updatable = false, nullable = false)
    @Digits(fraction = 2, integer = 10)
    private BigDecimal precio;

    @Column(name = "modelo", updatable = true, nullable = false)
    @Size(max = 10)
    private String modelo;
}
