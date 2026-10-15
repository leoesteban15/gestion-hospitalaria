package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Cama;
import com.hospital.gestion_hospitalaria.repository.CamaRepository;

@Service
public class CamaService {

	private final CamaRepository repository;
	
	public CamaService(CamaRepository repository){
		this.repository = repository;
	}
	
	public List<Cama> listar(){
		return repository.findAll();
	}
	
	public Cama guardar(Cama cama){
		return repository.save(cama);
	}
}
