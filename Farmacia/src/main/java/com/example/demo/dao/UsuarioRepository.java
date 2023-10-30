package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	//Usuario findByUsuarioAndContrasena(String usuario, String contrasena);
	Usuario findByUsuario(String usuario);
}