package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Rol;
import com.mitocode.service.IRolService;

@RestController
@RequestMapping("/roles")
public class RolController {

	@Autowired
	private IRolService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Rol>> listar(){
		List<Rol> roless=new ArrayList<>();
		roless = service.listar();
		return new ResponseEntity<List<Rol>>(roless, HttpStatus.OK);
		
	}
	
	
	@PostMapping(value="/usuario", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<Rol>> listar(@RequestBody String nombre){
		List<Rol> roless=new ArrayList<>();
		roless = service.listarRolPorUsuario(nombre);
		return new ResponseEntity<List<Rol>>(roless, HttpStatus.OK);
		
	}
	
}
