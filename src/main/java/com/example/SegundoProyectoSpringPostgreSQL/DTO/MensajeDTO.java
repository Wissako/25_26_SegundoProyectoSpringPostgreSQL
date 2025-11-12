package com.example.SegundoProyectoSpringPostgreSQL.DTO;

import lombok.*;

@Getter @Setter
@Builder @AllArgsConstructor
public class MensajeDTO {
    private Long id;
    private String titulo;
    private String texto;
    private String nombreCategoria;
}
