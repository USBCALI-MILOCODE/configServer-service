package com.rodriguez.curso.curso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodriguez.common.usuario.models.entity.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {

}
