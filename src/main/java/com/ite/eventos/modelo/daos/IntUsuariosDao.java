package com.ite.eventos.modelo.daos;

import java.util.List;

import com.ite.eventos.beans.Usuarios;



public interface IntUsuariosDao {

	List<Usuarios> findAll();
	
	int addUsuario(Usuarios usuario);
	
	Usuarios findByNombrePasword(String userName, String pasword);

}

