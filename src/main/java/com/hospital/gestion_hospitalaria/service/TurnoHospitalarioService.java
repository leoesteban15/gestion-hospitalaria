package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.TurnoHospitalario;
import com.hospital.gestion_hospitalaria.repository.TurnoHospitalarioRepository;

@Service
public class TurnoHospitalarioService {

	private final TurnoHospitalarioRepository repository;
	
	public TurnoHospitalarioService(TurnoHospitalarioRepository repository){
		this.repository = repository;
	}
	
	public List<TurnoHospitalario> listar(){
		return repository.findAll();
	}
	
	public TurnoHospitalario guardar(TurnoHospitalario turnoHospitalario){
		return repository.save(turnoHospitalario);
	}	
}
