package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Habitacion;
import com.hospital.gestion_hospitalaria.repository.HabitacionRepository;

@Service
public class HabitacionService {

	private final HabitacionRepository repository;
	
	public HabitacionService(HabitacionRepository repository){
		this.repository = repository;
	}
	
	public List<Habitacion> listar(){
		return repository.findAll();
	}
	
	public Habitacion guardar(Habitacion habitacion){
		return repository.save(habitacion);
	}
}
