package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.TurnoHospitalario;
import com.hospital.gestion_hospitalaria.service.TurnoHospitalarioService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/turnos-hospitalarios")
public class TurnoHospitalarioController {
	
	private final TurnoHospitalarioService service;
	
	public TurnoHospitalarioController(TurnoHospitalarioService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<TurnoHospitalario> listar(){
		return service.listar();
	}
	
	@PostMapping
	public TurnoHospitalario guardar(@RequestBody TurnoHospitalario turnoHospitalario){
		return service.guardar(turnoHospitalario);
	}
}
