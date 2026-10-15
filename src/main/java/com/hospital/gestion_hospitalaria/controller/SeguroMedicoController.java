package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.SeguroMedico;
import com.hospital.gestion_hospitalaria.service.SeguroMedicoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/seguros-medicos")
public class SeguroMedicoController {
	
	private final SeguroMedicoService service;
	
	public SeguroMedicoController(SeguroMedicoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<SeguroMedico> listar(){
		return service.listar();
	}
	
	@PostMapping
	public SeguroMedico guardar(@RequestBody SeguroMedico seguroMedico){
		return service.guardar(seguroMedico);
	}
}
