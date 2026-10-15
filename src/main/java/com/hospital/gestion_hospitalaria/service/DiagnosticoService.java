package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Diagnostico;
import com.hospital.gestion_hospitalaria.repository.DiagnosticoRepository;

@Service
public class DiagnosticoService {

	private final DiagnosticoRepository repository;
	
	public DiagnosticoService(DiagnosticoRepository repository){
		this.repository = repository;
	}
	
	public List<Diagnostico> listar(){
		return repository.findAll();
	}
	
	public Diagnostico guardar(Diagnostico diagnostico){
		return repository.save(diagnostico);
	}
}
