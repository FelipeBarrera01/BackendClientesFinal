package com.springboot.backendclientes.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backendclientes.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

	
	public List<Producto> findByNombreContainingIgnoreCase(String nombre);
	
}
