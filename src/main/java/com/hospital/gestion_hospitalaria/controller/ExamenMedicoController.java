package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.ExamenMedico;
import com.hospital.gestion_hospitalaria.service.ExamenMedicoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/examenes-medicos")
public class ExamenMedicoController {
	
	private final ExamenMedicoService service;
	
	public ExamenMedicoController(ExamenMedicoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<ExamenMedico> listar(){
		return service.listar();
	}
	
	@PostMapping
	public ExamenMedico guardar(@RequestBody ExamenMedico examenMedico){
		return service.guardar(examenMedico);
	}
}
