package com.springboot.backendclientes.service;

import com.springboot.backendclientes.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
