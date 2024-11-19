package com.sura.gestor.sabrosura.gestor_sabrosura.model.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "proyectos")
public class ProyectoEntity {
    @Id
    @Column(name = "id_proyectos", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    @Column(name = "fecha_inicio")
    private Instant fechaInicio;

    @Column(name = "fecha_fin")
    private Instant fechaFin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "equipos_id", nullable = false)
    private EquipoEntity equipos;
}