package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Habitacion;
import com.hospital.gestion_hospitalaria.service.HabitacionService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/habitaciones")
public class HabitacionController {
	
	private final HabitacionService service;
	
	public HabitacionController(HabitacionService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Habitacion> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Habitacion guardar(@RequestBody Habitacion habitacion){
		return service.guardar(habitacion);
	}
}
