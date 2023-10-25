package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEmpleado")
	private Integer codigo;
	@Column(name = "Nombres")
	private String nombre;
	@Column(name = "Apellidos")
	private String apellido;
	@Column(name = "Sexo")
	private String sexo;
	@Column(name = "Dni")
	private int dni;
	@Column(name = "Email")
	private String email;
	@Column(name = "Telefono")
	private int telefono;
	@Column(name = "Direccion")
	private String direccion;
	@Column(name = "HoraIngreso")
	private String ingreso;
	@Column(name = "HoraSalida")
	private String salida;
	@Column(name = "Sueldo")
	private Double sueldo;
	@Column(name = "Estado")
	private String estado;
	
	@JsonIgnore
	@OneToMany(mappedBy = "empleado")
	private List<Ventas> listaEmpleado;
	
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;


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


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getIngreso() {
		return ingreso;
	}


	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}


	public String getSalida() {
		return salida;
	}


	public void setSalida(String salida) {
		this.salida = salida;
	}


	public Double getSueldo() {
		return sueldo;
	}


	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public List<Ventas> getListaEmpleado() {
		return listaEmpleado;
	}


	public void setListaEmpleado(List<Ventas> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
	
}
