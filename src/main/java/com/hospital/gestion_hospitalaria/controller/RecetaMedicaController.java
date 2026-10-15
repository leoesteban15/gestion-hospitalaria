package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.RecetaMedica;
import com.hospital.gestion_hospitalaria.service.RecetaMedicaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/recetas-medicas")
public class RecetaMedicaController {
	
	private final RecetaMedicaService service;
	
	public RecetaMedicaController(RecetaMedicaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<RecetaMedica> listar(){
		return service.listar();
	}
	
	@PostMapping
	public RecetaMedica guardar(@RequestBody RecetaMedica recetaMedica){
		return service.guardar(recetaMedica);
	}
}
