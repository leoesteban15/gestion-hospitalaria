package com.hospital.gestion_hospitalaria.controller;
import com.hospital.gestion_hospitalaria.model.Pago;
import com.hospital.gestion_hospitalaria.service.PagoService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pagos")
public class PagoController {
	
	private final PagoService service;
	
	public PagoController(PagoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Pago> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Pago guardar(@RequestBody Pago pago){
		return service.guardar(pago);
	}
}
