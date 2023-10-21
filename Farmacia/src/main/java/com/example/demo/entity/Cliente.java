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
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente")
	private Integer codigo;
	@Column(name = "Nombres")
	private String nombre;
	@Column(name = "Apellidos")
	private String apellido;
	@Column(name = "Sexo")
	private String sexo;
	@Column(name = "Dni")
	private String dni;
	@Column(name = "Telefono")
	private String telefono;
	@Column(name = "Email")
	private String email;
	@Column(name = "Direccion")
	private String direccion;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Ventas> listaCliente;


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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<Ventas> getListaCliente() {
		return listaCliente;
	}


	public void setListaCliente(List<Ventas> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	
	
	
}
