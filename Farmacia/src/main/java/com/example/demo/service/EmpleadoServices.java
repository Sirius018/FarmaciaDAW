package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpleadoRepository;
import com.example.demo.entity.Empleado;

@Service
public class EmpleadoServices {
@Autowired

	private EmpleadoRepository repo;

	public List<Empleado> listarTodos(){
		return repo.findAll();
	}
	
}
