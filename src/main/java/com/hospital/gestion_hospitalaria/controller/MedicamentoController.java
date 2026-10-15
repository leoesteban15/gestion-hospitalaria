package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Medicamento;
import com.hospital.gestion_hospitalaria.service.MedicamentoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/medicamentos")
public class MedicamentoController {
	
	private final MedicamentoService service;
	
	public MedicamentoController(MedicamentoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Medicamento> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Medicamento guardar(@RequestBody Medicamento medicamento){
		return service.guardar(medicamento);
	}
}
