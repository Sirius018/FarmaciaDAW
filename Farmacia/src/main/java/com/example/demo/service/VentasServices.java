package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VentasRepository;
import com.example.demo.entity.Ventas;

@Service
public class VentasServices {
@Autowired

	private VentasRepository repo;

	public void registrar(Ventas v) {
	repo.save(v);
}

	public void actualizar(Ventas v) {
	repo.save(v);
}

	public void eliminar(Integer cod) {
	repo.deleteById(cod);
}

	public Ventas buscarPorID(Integer cod) {
	return repo.findById(cod).orElse(null);
}

	public List<Ventas> listarTodos(){
		return repo.findAll();
	}
}
