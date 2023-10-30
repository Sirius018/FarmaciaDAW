package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UsuarioRepository;
import com.example.demo.entity.Usuario;

@Service
public class UsuarioService {
	@Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findByUsuario(String usuario) {
        return usuarioRepository.findByUsuario(usuario);
    }
		
   
}
