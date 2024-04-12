/*package com.lista.app.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = {"nombre_usuario", "email"}))
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_usuario")
    private String username;
    @Column(name = "contrasena")
    private String password;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellido")
    private String surname;
    @Column
    private String email;
    @Column(name = "fecha_creacion")
    private LocalDateTime created_at;
    @Column(name = "fecha_modificacion")
    private LocalDateTime modified_at;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

}*/
