package com.sura.gestor.sabrosura.gestor_sabrosura.model.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="equipos")
public class EquipoEntity {
    @Id
    @Column(name = "id_equipos", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idequipos;

    @Column(name = "nombre", nullable = false)
    private String  nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}