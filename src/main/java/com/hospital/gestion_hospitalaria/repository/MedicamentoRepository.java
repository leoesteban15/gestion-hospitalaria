package com.hospital.gestion_hospitalaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.gestion_hospitalaria.model.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{

}
