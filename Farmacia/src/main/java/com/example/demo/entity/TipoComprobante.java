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
@Table(name = "tipocomprobante")
public class TipoComprobante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoComprobante")
	private Integer codigo;
	@Column(name = "Descripcion")
	private String descripcion;
	@Column(name = "Estado")
	private String estado;
	
	@JsonIgnore
	@OneToMany(mappedBy = "comprobante")
	private List<Ventas> listaComprobante;

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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Ventas> getListaComprobante() {
		return listaComprobante;
	}

	public void setListaComprobante(List<Ventas> listaComprobante) {
		this.listaComprobante = listaComprobante;
	}
	
	
	

}
