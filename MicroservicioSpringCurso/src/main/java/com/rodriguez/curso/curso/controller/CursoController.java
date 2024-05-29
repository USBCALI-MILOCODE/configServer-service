package com.rodriguez.curso.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.controller.CommonController;
import com.rodriguez.common.usuario.models.entity.Alumno;
import com.rodriguez.common.usuario.models.entity.Curso;
import com.rodriguez.curso.curso.service.CursoService;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {

	@PutMapping("/asignar-alumno/{id}")
	public ResponseEntity<?> asignarAlumno(@RequestBody List<Alumno> alumno, @PathVariable Long id) {
		
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		alumno.forEach( a -> {
			cursoBd.addAlumno(a);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
	}
	
	@PutMapping("/eliminar-alumno/{id}")
	public ResponseEntity<?> eliminarAlumno(@RequestBody Alumno alumno, @PathVariable Long id) {
		
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		
		cursoBd.removeAlumno(alumno);
		
	    return ResponseEntity.status(HttpStatus.OK).body(service.save(cursoBd));
	}
}
