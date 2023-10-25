package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "ventas")
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVenta")
	private Integer codigo;
	@Column(name = "Serie")
	private String serie;
	@Column(name = "Numero")
	private String numero;
	@Column(name = "Fecha")
	private LocalDate fecha;
	@Column(name = "VentaTotal")
	private double vtotal;
	@Column(name = "Descuento")
	private double descuento;
	@Column(name = "SubTotal")
	private double stotal;
	@Column(name = "Igv")
	private double igv;
	@Column(name = "Total")
	private double total;
	@Column(name = "Estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "idTipoComprobante")
	private TipoComprobante comprobante;
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	private Empleado empleado;

	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getVtotal() {
		return vtotal;
	}

	public void setVtotal(double vtotal) {
		this.vtotal = vtotal;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getStotal() {
		return stotal;
	}

	public void setStotal(double stotal) {
		this.stotal = stotal;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoComprobante getComprobante() {
		return comprobante;
	}

	public void setComprobante(TipoComprobante comprobante) {
		this.comprobante = comprobante;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	
	
	
	
	
}
