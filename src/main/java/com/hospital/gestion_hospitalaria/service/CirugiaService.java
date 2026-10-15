package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Cirugia;
import com.hospital.gestion_hospitalaria.repository.CirugiaRepository;

@Service
public class CirugiaService {

	private final CirugiaRepository repository;
	
	public CirugiaService(CirugiaRepository repository){
		this.repository = repository;
	}
	
	public List<Cirugia> listar(){
		return repository.findAll();
	}
	
	public Cirugia guardar(Cirugia cirugia){
		return repository.save(cirugia);
	}
}
