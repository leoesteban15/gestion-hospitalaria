package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.HistoriaClinica;
import com.hospital.gestion_hospitalaria.service.HistoriaClinicaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/historias-clinicas")
public class HistoriaClinicaController {
	
	private final HistoriaClinicaService service;
	
	public HistoriaClinicaController(HistoriaClinicaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<HistoriaClinica> listar(){
		return service.listar();
	}
	
	@PostMapping
	public HistoriaClinica guardar(@RequestBody HistoriaClinica historiaClinica){
		return service.guardar(historiaClinica);
	}
}
