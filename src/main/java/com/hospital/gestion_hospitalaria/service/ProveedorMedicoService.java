package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.ProveedorMedico;
import com.hospital.gestion_hospitalaria.repository.ProveedorMedicoRepository;

@Service
public class ProveedorMedicoService {

	private final ProveedorMedicoRepository repository;
	
	public ProveedorMedicoService(ProveedorMedicoRepository repository){
		this.repository = repository;
	}
	
	public List<ProveedorMedico> listar(){
		return repository.findAll();
	}
	
	public ProveedorMedico guardar(ProveedorMedico proveedorMedico){
		return repository.save(proveedorMedico);
	}
}
