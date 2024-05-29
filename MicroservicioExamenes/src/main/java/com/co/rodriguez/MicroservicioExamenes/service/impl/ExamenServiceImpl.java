package com.co.rodriguez.MicroservicioExamenes.service.impl;

import org.springframework.stereotype.Service;

import com.co.rodriguez.MicroservicioExamenes.repository.ExamenRepository;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonService;
import com.co.rodriguez.mdbspringboot.MicroservicioSpringCommons.service.CommonServiceImpl;
import com.rodriguez.common.usuario.models.entity.Examen;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen>{

}
