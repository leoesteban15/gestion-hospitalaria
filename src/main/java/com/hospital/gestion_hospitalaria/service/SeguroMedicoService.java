package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.SeguroMedico;
import com.hospital.gestion_hospitalaria.repository.SeguroMedicoRepository;

@Service
public class SeguroMedicoService {

	private final SeguroMedicoRepository repository;
	
	public SeguroMedicoService(SeguroMedicoRepository repository){
		this.repository = repository;
	}
	
	public List<SeguroMedico> listar(){
		return repository.findAll();
	}
	
	public SeguroMedico guardar(SeguroMedico seguroMedico){
		return repository.save(seguroMedico);
	}
}
