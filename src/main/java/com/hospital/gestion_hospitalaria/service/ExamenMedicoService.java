package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.ExamenMedico;
import com.hospital.gestion_hospitalaria.repository.ExamenMedicoRepository;

@Service
public class ExamenMedicoService {

	private final ExamenMedicoRepository repository;
	
	public ExamenMedicoService(ExamenMedicoRepository repository){
		this.repository = repository;
	}
	
	public List<ExamenMedico> listar(){
		return repository.findAll();
	}
	
	public ExamenMedico guardar(ExamenMedico examenMedico){
		return repository.save(examenMedico);
	}
}
