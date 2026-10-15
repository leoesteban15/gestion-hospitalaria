package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.CitaMedica;
import com.hospital.gestion_hospitalaria.repository.CitaMedicaRepository;

@Service
public class CitaMedicaService {

	private final CitaMedicaRepository repository;
	
	public CitaMedicaService(CitaMedicaRepository repository){
		this.repository = repository;
	}
	
	public List<CitaMedica> listar(){
		return repository.findAll();
	}
	
	public CitaMedica guardar(CitaMedica citaMedica){
		return repository.save(citaMedica);
	}
}
