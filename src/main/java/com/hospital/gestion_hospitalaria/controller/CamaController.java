package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Cama;
import com.hospital.gestion_hospitalaria.service.CamaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/camas")
public class CamaController {
	
	private final CamaService service;
	
	public CamaController(CamaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Cama> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Cama guardar(@RequestBody Cama cama){
		return service.guardar(cama);
	}
}
