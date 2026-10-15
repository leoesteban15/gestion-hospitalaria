package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Tratamiento;
import com.hospital.gestion_hospitalaria.repository.TratamientoRepository;

@Service
public class TratamientoService {

	private final TratamientoRepository repository;
	
	public TratamientoService(TratamientoRepository repository){
		this.repository = repository;
	}
	
	public List<Tratamiento> listar(){
		return repository.findAll();
	}
	
	public Tratamiento guardar(Tratamiento tratamiento){
		return repository.save(tratamiento);
	}
}
