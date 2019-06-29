package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Rol;

public interface IRolService extends ICRUD<Rol>{
	
	List<Rol> listarRolPorUsuario(String nombre);
}
