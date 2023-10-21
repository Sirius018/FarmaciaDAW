package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductoRepository;
import com.example.demo.entity.Producto;


@Service
public class ProductoServices {
	@Autowired	
	private ProductoRepository repo;
	
	public void registrar(Producto m) {
		repo.save(m);
	}
	
	public void actualizar(Producto m) {
		repo.save(m);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	
	public Producto buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public List<Producto> listarTodos(){
		return repo.findAll();
	}


	
	
	
}
