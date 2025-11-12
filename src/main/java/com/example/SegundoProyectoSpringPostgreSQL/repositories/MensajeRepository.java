package com.example.SegundoProyectoSpringPostgreSQL.repositories;

import com.example.SegundoProyectoSpringPostgreSQL.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje,Long> {
    public List<Mensaje> findByTitulo(String titulo);
    public List<Mensaje> findByFechaCreacionBetween(Date fechaCreacion, Date fechaActual);
}
