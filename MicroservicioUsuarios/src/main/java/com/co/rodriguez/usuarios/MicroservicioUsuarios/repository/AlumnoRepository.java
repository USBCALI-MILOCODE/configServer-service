package com.co.rodriguez.usuarios.MicroservicioUsuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.rodriguez.common.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
