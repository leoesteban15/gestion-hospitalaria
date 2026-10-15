package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Factura;
import com.hospital.gestion_hospitalaria.repository.FacturaRepository;

@Service
public class FacturaService {
	
	private final FacturaRepository repository;
	
	public FacturaService(FacturaRepository repository){
		this.repository = repository;
	}
	
	public List<Factura> listar(){
		return repository.findAll();
	}
	
	public Factura guardar(Factura factura){
		return repository.save(factura);
	}
}
