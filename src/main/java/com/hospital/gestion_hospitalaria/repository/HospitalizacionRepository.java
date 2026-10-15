package com.hospital.gestion_hospitalaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hospital.gestion_hospitalaria.model.Hospitalizacion;

public interface HospitalizacionRepository extends JpaRepository<Hospitalizacion, Long>{

}
