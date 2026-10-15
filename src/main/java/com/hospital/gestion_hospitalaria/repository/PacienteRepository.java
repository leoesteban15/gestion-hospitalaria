package com.hospital.gestion_hospitalaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.gestion_hospitalaria.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
