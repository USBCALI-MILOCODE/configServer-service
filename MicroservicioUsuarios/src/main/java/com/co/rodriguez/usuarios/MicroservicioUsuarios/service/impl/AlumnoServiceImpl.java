package com.co.rodriguez.usuarios.MicroservicioUsuarios.service.impl;

import org.springframework.stereotype.Service;

import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonService;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonServiceImpl;
import com.co.rodriguez.usuarios.MicroservicioUsuarios.repository.AlumnoRepository;
import com.rodriguez.common.usuario.models.entity.Alumno;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements CommonService<Alumno>{
}
