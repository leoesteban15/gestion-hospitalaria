package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.RecetaMedica;
import com.hospital.gestion_hospitalaria.repository.RecetaMedicaRepository;

@Service
public class RecetaMedicaService {

	private final RecetaMedicaRepository repository;
	
	public RecetaMedicaService(RecetaMedicaRepository repository){
		this.repository = repository;
	}
	
	public List<RecetaMedica> listar(){
		return repository.findAll();
	}
	
	public RecetaMedica guardar(RecetaMedica recetaMedica){
		return repository.save(recetaMedica);
	}
}
