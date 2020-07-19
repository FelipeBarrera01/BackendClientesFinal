package com.springboot.backendclientes.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backendclientes.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
