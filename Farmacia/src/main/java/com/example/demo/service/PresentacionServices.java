package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PresentacionRepository;
import com.example.demo.entity.Presentacion;

@Service
public class PresentacionServices {
	@Autowired
	
	private PresentacionRepository repo;
	
	public List<Presentacion> listarTodos(){
		return repo.findAll();
	}
}
