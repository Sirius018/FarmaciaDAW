package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class FarmaciaApplicationTests {
	@Autowired
	private BCryptPasswordEncoder encoder;

	// encriptar
	
	public static void main(String[] args) {
        String password = "123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);

        System.out.println("Contraseña original: " + password);
        System.out.println("Contraseña encriptada: " + hashedPassword);

        // Verificar si la contraseña proporcionada coincide con la contraseña encriptada
        boolean matches = passwordEncoder.matches(password, hashedPassword);
        System.out.println("Coincide: " + matches);
    }
	
}
