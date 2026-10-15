package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Pago;
import com.hospital.gestion_hospitalaria.repository.PagoRepository;

@Service
public class PagoService {

	private final PagoRepository repository;
	
	public PagoService(PagoRepository repository){
		this.repository = repository;
	}
	
	public List<Pago> listar(){
		return repository.findAll();
	}
	
	public Pago guardar(Pago pago){
		return repository.save(pago);
	}
}
