package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Hospitalizacion;
import com.hospital.gestion_hospitalaria.repository.HospitalizacionRepository;

@Service
public class HospitalizacionService {

	private final HospitalizacionRepository repository;
	
	public HospitalizacionService(HospitalizacionRepository repository){
		this.repository = repository;
	}
	
	public List<Hospitalizacion> listar(){
		return repository.findAll();
	}
	
	public Hospitalizacion guardar(Hospitalizacion hospitalizacion){
		return repository.save(hospitalizacion);
	}
}
