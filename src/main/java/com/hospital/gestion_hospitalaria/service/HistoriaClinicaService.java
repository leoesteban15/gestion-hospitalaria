package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.HistoriaClinica;
import com.hospital.gestion_hospitalaria.repository.HistoriaClinicaRepository;

@Service
public class HistoriaClinicaService {

	private final HistoriaClinicaRepository repository;
	
	public HistoriaClinicaService(HistoriaClinicaRepository repository){
		this.repository = repository;
	}
	
	public List<HistoriaClinica> listar(){
		return repository.findAll();
	}
	
	public HistoriaClinica guardar(HistoriaClinica historiaClinica){
		return repository.save(historiaClinica);
	}
}
