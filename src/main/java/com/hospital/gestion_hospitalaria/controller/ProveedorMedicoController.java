package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.ProveedorMedico;
import com.hospital.gestion_hospitalaria.service.ProveedorMedicoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/proveedores-medicos")
public class ProveedorMedicoController {
	
	private final ProveedorMedicoService service;
	
	public ProveedorMedicoController(ProveedorMedicoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<ProveedorMedico> listar(){
		return service.listar();
	}
	
	@PostMapping
	public ProveedorMedico guardar(@RequestBody ProveedorMedico proveedorMedico){
		return service.guardar(proveedorMedico);
	}
}
