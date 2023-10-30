package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired UsuarioService usuarioService;
	@Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("/sesion")
	public String login() {
		return "login";
	}	
	



	@PostMapping("/validarLogin")
    public String validarLogin(@RequestParam String usuario, @RequestParam String contrasena, Model model) {
        Usuario usuarioFromDB = usuarioService.findByUsuario(usuario);
        System.out.println(usuario);
        System.out.println(contrasena);

        if (usuarioFromDB != null && bCryptPasswordEncoder.matches(contrasena, usuarioFromDB.getContrasena())) {
            model.addAttribute("mensaje", "Login exitoso.");
            return "redirect:/home"; // Cambia "/dashboard" por la ruta a la que deseas redirigir tras un inicio de sesión exitoso
        } else {
            model.addAttribute("error", "Credenciales inválidas. Por favor, intenta de nuevo.");
            return "login"; // Cambia "login" por la vista de tu formulario de inicio de sesión
        }
    }


}
