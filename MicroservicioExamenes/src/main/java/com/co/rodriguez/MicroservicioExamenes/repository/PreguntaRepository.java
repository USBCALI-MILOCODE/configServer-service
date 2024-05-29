package com.co.rodriguez.MicroservicioExamenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodriguez.common.usuario.models.entity.Pregunta;

@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long>{

}
