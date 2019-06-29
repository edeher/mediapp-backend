package com.mitocode.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Rol;

public interface IRolDAO extends JpaRepository<Rol, Integer>{
	
	

	@Query(value="select r.* from usuario_rol ur inner join rol r on ur.id_rol=r.id_rol inner join usuario u on ur.id_usuario=u.id_usuario where u.nombre = :nombre", nativeQuery = true)
	List<Object[]> listarRolPorUsuario(@Param("nombre") String nombre);

}
