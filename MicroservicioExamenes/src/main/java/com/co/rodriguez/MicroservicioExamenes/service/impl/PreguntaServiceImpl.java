package com.co.rodriguez.MicroservicioExamenes.service.impl;

import org.springframework.stereotype.Service;

import com.co.rodriguez.MicroservicioExamenes.repository.PreguntaRepository;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonService;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonServiceImpl;
import com.rodriguez.common.usuario.models.entity.Pregunta;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta>  {

}
