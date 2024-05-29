package com.co.rodriguez.MicroservicioExamenes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.rodriguez.MicroservicioExamenes.service.ExamenService;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.controller.CommonController;
import com.rodriguez.common.usuario.models.entity.Examen;
import com.rodriguez.common.usuario.models.entity.Pregunta;



@RestController
public class ExamenController extends CommonController<Examen, ExamenService> {

	@PutMapping("/asignar-pregunta/{id}")
	public ResponseEntity<?> asignarPregunta(@RequestBody List<Pregunta> preguntas, @PathVariable Long id) {
		
		Optional<Examen> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Examen examenBd = ob.get();
		preguntas.forEach( a -> {
			examenBd.addPregunta(a);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(examenBd));
	}
	
	@PutMapping("/eliminar-pregunta/{id}")
	public ResponseEntity<?> eliminarPregunta(@RequestBody Pregunta pregunta, @PathVariable Long id) {
		
		Optional<Examen> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Examen examenBd = ob.get();
		
		examenBd.removePregunta(pregunta);
		
	    return ResponseEntity.status(HttpStatus.OK).body(service.save(examenBd));
	}
	
}
