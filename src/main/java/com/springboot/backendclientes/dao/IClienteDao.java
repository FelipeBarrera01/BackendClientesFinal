package com.springboot.backendclientes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.backendclientes.entity.Cliente;
import com.springboot.backendclientes.entity.Region;



public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
	@Query("from region")
	public List<Region> findAllRegiones();
}

