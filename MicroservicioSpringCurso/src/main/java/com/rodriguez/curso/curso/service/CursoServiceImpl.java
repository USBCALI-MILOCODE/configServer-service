package com.rodriguez.curso.curso.service;
import org.springframework.stereotype.Service;

import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonService;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonServiceImpl;
import com.rodriguez.common.usuario.models.entity.Curso;
import com.rodriguez.curso.curso.repository.CursoRepository;


@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso>{
	
}
