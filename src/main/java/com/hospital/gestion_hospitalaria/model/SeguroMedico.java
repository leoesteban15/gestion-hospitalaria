package com.hospital.gestion_hospitalaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SeguroMedico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombreAseguradora;
	private String numeroPoliza;
	private String tipoCobertura;
	private Boolean activo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreAseguradora() {
		return nombreAseguradora;
	}
	public void setNombreAseguradora(String nombreAseguradora) {
		this.nombreAseguradora = nombreAseguradora;
	}
	public String getNumeroPoliza() {
		return numeroPoliza;
	}
	public void setNumeroPoliza(String numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	public String getTipoCobertura() {
		return tipoCobertura;
	}
	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}	
}
