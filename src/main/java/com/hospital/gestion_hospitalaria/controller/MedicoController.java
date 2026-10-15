package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Medico;
import com.hospital.gestion_hospitalaria.service.MedicoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/medicos")
public class MedicoController {
	
	private final MedicoService service;
	
	public MedicoController(MedicoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Medico> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Medico guardar(@RequestBody Medico medico){
		return service.guardar(medico);
	}
}
