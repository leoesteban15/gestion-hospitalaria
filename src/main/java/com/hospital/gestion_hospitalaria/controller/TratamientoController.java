package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Tratamiento;
import com.hospital.gestion_hospitalaria.service.TratamientoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tratamientos")
public class TratamientoController {
	
	private final TratamientoService service;
	
	public TratamientoController(TratamientoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Tratamiento> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Tratamiento guardar(@RequestBody Tratamiento tratamiento){
		return service.guardar(tratamiento);
	}
}
