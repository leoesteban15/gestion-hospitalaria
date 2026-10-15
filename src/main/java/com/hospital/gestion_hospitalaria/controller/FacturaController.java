package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Factura;
import com.hospital.gestion_hospitalaria.service.FacturaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/facturas")
public class FacturaController {
	
	private final FacturaService service;
	
	public FacturaController(FacturaService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Factura> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Factura guardar(@RequestBody Factura factura){
		return service.guardar(factura);
	}
}
