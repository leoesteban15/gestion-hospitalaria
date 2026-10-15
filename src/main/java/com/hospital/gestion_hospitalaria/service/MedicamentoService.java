package com.hospital.gestion_hospitalaria.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hospital.gestion_hospitalaria.model.Medicamento;
import com.hospital.gestion_hospitalaria.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

	private final MedicamentoRepository repository;
	
	public MedicamentoService(MedicamentoRepository repository){
		this.repository = repository;
	}
	
	public List<Medicamento> listar(){
		return repository.findAll();
	}
	
	public Medicamento guardar(Medicamento medicamento){
		return repository.save(medicamento);
	}
}
