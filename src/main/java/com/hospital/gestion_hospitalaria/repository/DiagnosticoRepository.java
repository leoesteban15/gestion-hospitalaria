package com.hospital.gestion_hospitalaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.gestion_hospitalaria.model.Diagnostico;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long>{

}
