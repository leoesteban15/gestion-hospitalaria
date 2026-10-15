package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Diagnostico;
import com.hospital.gestion_hospitalaria.service.DiagnosticoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/diagnosticos")
public class DiagnosticoController {
	
	private final DiagnosticoService service;
	
	public DiagnosticoController(DiagnosticoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Diagnostico> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Diagnostico guardar(@RequestBody Diagnostico diagnostico){
		return service.guardar(diagnostico);
	}
}
