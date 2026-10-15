package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Enfermero;
import com.hospital.gestion_hospitalaria.service.EnfermeroService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/enfermeros")
public class EnfermeroController {
	
	private final EnfermeroService service;
	
	public EnfermeroController(EnfermeroService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Enfermero> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Enfermero guardar(@RequestBody Enfermero enfermero){
		return service.guardar(enfermero);
	}
}
