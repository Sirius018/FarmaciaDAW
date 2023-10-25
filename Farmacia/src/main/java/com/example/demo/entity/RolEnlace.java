package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_enlace")
public class RolEnlace {
	@Id
    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;

    @Id
    @ManyToOne
    @JoinColumn(name = "idenlace")
    private Enlace enlace;

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Enlace getEnlace() {
		return enlace;
	}

	public void setEnlace(Enlace enlace) {
		this.enlace = enlace;
	}

    
    
}
