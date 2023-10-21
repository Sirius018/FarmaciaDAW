package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
