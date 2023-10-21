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
@Table(name = "laboratorio")
public class Laboratorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLaboratorio")
	private Integer codigo;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Direccion")
	private String direccion;
	@Column(name = "Telefono")
	private int telefono;
	
	@JsonIgnore
	@OneToMany(mappedBy = "laboratorio")
	private List<Producto> listaLaboratorio;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Producto> getListaLaboratorio() {
		return listaLaboratorio;
	}

	public void setListaLaboratorio(List<Producto> listaLaboratorio) {
		this.listaLaboratorio = listaLaboratorio;
	}
	
	

}
