package com.sura.gestor.sabrosura.gestor_sabrosura.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="tareas")
public class TareasEntity {

    @Id
    @Column(name = "id_tareas", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtareas;
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "fecha_creacion", nullable = true)
    private LocalDate fechaCreacion ;
    @Column(name = "fecha_vencimiento", nullable = true)
    private LocalDate fechaVencimiento;

    @Column(name = "prioridad", nullable = false)
    private String prioridad;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proyectos_id", nullable = false)
    private ProyectoEntity proyectoEntity;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuarios_id", nullable = false)
    private UsuariosEntity usuariosEntity;

}