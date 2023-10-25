package com.example.demo.entity;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="enlace")
public class Enlace {
	 @Id
	 @Column(name = "idenlace")
	 private Integer idEnlace;

	 @Column(name = "descripcion")
	 private String descripcion;

	 @Column(name = "ruta")
	 private String ruta;

	 @OneToMany(mappedBy = "enlace")
	 private List<RolEnlace> listaRolEnlaces;

	public Integer getIdEnlace() {
		return idEnlace;
	}

	public void setIdEnlace(Integer idEnlace) {
		this.idEnlace = idEnlace;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public List<RolEnlace> getListaRolEnlaces() {
		return listaRolEnlaces;
	}

	public void setListaRolEnlaces(List<RolEnlace> listaRolEnlaces) {
		this.listaRolEnlaces = listaRolEnlaces;
	}


	 
}
