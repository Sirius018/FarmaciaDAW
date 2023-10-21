package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "presentacion")
public class Presentacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPresentacion")
	private Integer codigo;
	@Column(name = "Descripcion")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "presentacion")
	private List<Producto> listaPresentacion;


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<Producto> getListaPresentacion() {
		return listaPresentacion;
	}


	public void setListaPresentacion(List<Producto> listaPresentacion) {
		this.listaPresentacion = listaPresentacion;
	}
	
	
	
	
	

}
