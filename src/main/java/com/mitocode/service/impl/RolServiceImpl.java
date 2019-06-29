package com.mitocode.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IRolDAO;
import com.mitocode.model.Rol;
import com.mitocode.service.IRolService;

@Service
public class RolServiceImpl implements IRolService{
	
	@Autowired
	private IRolDAO dao;

	@Override
	public Rol registrar(Rol t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Rol modificar(Rol t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
		
	}

	@Override
	public Rol listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Rol> listarRolPorUsuario(String nombre) {
		List<Rol> roles=new ArrayList<>();
		dao.listarRolPorUsuario(nombre).forEach(x -> {
			Rol r= new Rol();
			r.setIdRol((Integer.parseInt(String.valueOf(x[0]))));
			r.setDescripcion(String.valueOf(x[1]));
			r.setNombre(String.valueOf(x[2]));
			
			roles.add(r);
		});
		return roles;
	}

}
