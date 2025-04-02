package com.example.demo.Articulo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Articulo {
    @Id
    @GeneratedValue
    private String id;
    @Basic
    private String nombre;
    private String descripcion;
    private float precio;
    private String modelo;
}
