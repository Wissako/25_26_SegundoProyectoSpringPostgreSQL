package com.example.SegundoProyectoSpringPostgreSQL.repositories;

import com.example.SegundoProyectoSpringPostgreSQL.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
