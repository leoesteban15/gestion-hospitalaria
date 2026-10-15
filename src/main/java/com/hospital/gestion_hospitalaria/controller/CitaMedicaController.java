package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.CitaMedica;
import com.hospital.gestion_hospitalaria.service.CitaMedicaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/citas-medicas")
public class CitaMedicaController {
	
	private final CitaMedicaService service;
	
	public CitaMedicaController(CitaMedicaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<CitaMedica> listar(){
		return service.listar();
	}
	
	@PostMapping
	public CitaMedica guardar(@RequestBody CitaMedica citaMedica){
		return service.guardar(citaMedica);
	}
}
