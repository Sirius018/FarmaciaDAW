package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LaboratorioRepository;
import com.example.demo.entity.Laboratorio;

@Service
public class LaboratorioServices {

	@Autowired
	private LaboratorioRepository repo;
	
	public List<Laboratorio> listarTodos(){
		return repo.findAll();
	}
	
}
