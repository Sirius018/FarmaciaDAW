package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TipoComprobanteRepository;
import com.example.demo.entity.TipoComprobante;

@Service
public class TipoComprobanteServices {
@Autowired
	private TipoComprobanteRepository repo;

	public List<TipoComprobante> listarTodos(){
		return repo.findAll();
	}
}
