package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Laboratorio;
import com.hospital.gestion_hospitalaria.repository.LaboratorioRepository;

@Service
public class LaboratorioService {

	private final LaboratorioRepository repository;
	
	public LaboratorioService(LaboratorioRepository repository){
		this.repository = repository;
	}
	
	public List<Laboratorio> listar(){
		return repository.findAll();
	}
	
	public Laboratorio guardar(Laboratorio laboratorio){
		return repository.save(laboratorio);
	}
}
