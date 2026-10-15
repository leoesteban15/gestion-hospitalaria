package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Paciente;
import com.hospital.gestion_hospitalaria.repository.PacienteRepository;

@Service
public class PacienteService {

	private final PacienteRepository repository;
	
	public PacienteService(PacienteRepository repository){
		this.repository = repository;
	}
	
	public List<Paciente> listar(){
		return repository.findAll();
	}
	
	public Paciente guardar(Paciente paciente){
		return repository.save(paciente);
	}
}
