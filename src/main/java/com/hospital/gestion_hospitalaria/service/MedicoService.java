package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Medico;
import com.hospital.gestion_hospitalaria.repository.MedicoRepository;

@Service
public class MedicoService {

	private final MedicoRepository repository;
	
	public MedicoService(MedicoRepository repository){
		this.repository = repository;
	}
	
	public List<Medico> listar(){
		return repository.findAll();
	}
	
	public Medico guardar(Medico medico){
		return repository.save(medico);
	}	
}
