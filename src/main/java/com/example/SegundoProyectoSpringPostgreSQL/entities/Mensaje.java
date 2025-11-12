package com.example.SegundoProyectoSpringPostgreSQL.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mensajes")
public class Mensaje {

    @Id //Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autonumérico
    private Long id;

    @NotBlank(message = "El título no puede estar en blanco")
    @Size(min = 3, max = 100)
    private String titulo;

    @NotBlank(message = "El texto del mensaje no puede estar en blanco")
    private String texto;

    @CreationTimestamp
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;


    @ManyToOne
    private Categoria categoria;
}
