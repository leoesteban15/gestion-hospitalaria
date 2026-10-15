package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Hospitalizacion;
import com.hospital.gestion_hospitalaria.service.HospitalizacionService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hospitalizaciones")
public class HospitalizacionController {
	
	private final HospitalizacionService service;
	
	public HospitalizacionController(HospitalizacionService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Hospitalizacion> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Hospitalizacion guardar(@RequestBody Hospitalizacion hospitalizacion){
		return service.guardar(hospitalizacion);
	}
}
