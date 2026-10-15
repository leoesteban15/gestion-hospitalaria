package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Laboratorio;
import com.hospital.gestion_hospitalaria.service.LaboratorioService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/laboratorios")
public class LaboratorioController {
	
	private final LaboratorioService service;
	
	public LaboratorioController(LaboratorioService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Laboratorio> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Laboratorio guardar(@RequestBody Laboratorio laboratorio){
		return service.guardar(laboratorio);
	}
}
