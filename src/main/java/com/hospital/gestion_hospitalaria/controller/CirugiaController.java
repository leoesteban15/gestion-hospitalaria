package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Cirugia;
import com.hospital.gestion_hospitalaria.service.CirugiaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cirugias")
public class CirugiaController {
	
	private final CirugiaService service;
	
	public CirugiaController(CirugiaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Cirugia> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Cirugia guardar(@RequestBody Cirugia cirugia){
		return service.guardar(cirugia);
	}
}
