package com.co.rodriguez.MicroservicioExamenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rodriguez.common.usuario.models.entity.Examen;

@Repository
public interface ExamenRepository extends CrudRepository<Examen, Long> {

}
