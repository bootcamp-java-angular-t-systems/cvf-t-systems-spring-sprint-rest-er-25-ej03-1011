package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Long id;
	private String lugar;
	private int capacidad;

	@OneToMany
	@JoinColumn(name="almacen_id")
	private List<Caja> caja;
	
	public Almacen(Long id, String lugar, int capacidad) {
		//super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	public Almacen() {
		// super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return caja;
	}

	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}