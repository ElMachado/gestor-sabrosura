package com.sura.gestor.sabrosura.gestor_sabrosura.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="usuarios")
public class UsuariosEntity {
    @Id
    @Column(name = "id_usuarios", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuarios;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "tipo_usuario", nullable = false)
    private String tipoUsuario;

}