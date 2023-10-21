package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClienteRepository;
import com.example.demo.entity.Cliente;

@Service

public class ClienteServices {
	@Autowired
	private ClienteRepository repo;
	
	public List<Cliente> listarTodos(){
		return repo.findAll();
	}

}
