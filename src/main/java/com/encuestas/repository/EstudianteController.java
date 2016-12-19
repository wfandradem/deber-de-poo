package com.encuestas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.encuestas.repository.EstudianteRepository;

@RestController
public class EstudianteController {

	@Autowired
	private EstudianteRepository estudianteRepository; 
	
}

