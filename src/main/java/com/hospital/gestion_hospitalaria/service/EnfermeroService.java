package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Enfermero;
import com.hospital.gestion_hospitalaria.repository.EnfermeroRepository;

@Service
public class EnfermeroService {

	private final EnfermeroRepository repository;
	
	public EnfermeroService(EnfermeroRepository repository){
		this.repository = repository;
	}
	
	public List<Enfermero> listar(){
		return repository.findAll();
	}
	
	public Enfermero guardar(Enfermero enfermero){
		return repository.save(enfermero);
	}
}
