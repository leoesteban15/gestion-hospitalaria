package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Paciente;
import com.hospital.gestion_hospitalaria.service.PacienteService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/estudiantes")
public class PacienteController {
	
	private final PacienteService service;
	
	public PacienteController(PacienteService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Paciente> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Paciente guardar(@RequestBody Paciente paciente){
		return service.guardar(paciente);
	}
}
