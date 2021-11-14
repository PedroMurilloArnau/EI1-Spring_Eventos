package com.ite.eventos.modelo.daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.ite.eventos.beans.Usuarios;

public class UsuariosDaolmpl implements IntUsuariosDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Usuarios> lista;
	
	public UsuariosDaolmpl() {
		lista = new ArrayList<Usuarios>();
		cargarDatos();
	}
	
	public void cargarDatos() {
		
		lista.add(new Usuarios(1,"Periquito","Contraseña123","Pedro.grande@tedetodo.com","Pedro","C/ constanza 4 Madrid",1,new Date()));
		lista.add(new Usuarios(2,"Grandote","Contraseña1234","Grande.grandete@tedetodo.com","Porfido","C/ Mestizo 4 Madrid",1,new Date()));
		
	}

	@Override
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public int addUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	//Busca de la lista el usuario
	public Usuarios findByNombrePasword(String userName, String pasword) {
		
		
		for (Usuarios usu: lista) {
		if(usu.getUserName().equals(userName)) {
		if(usu.getPasword().equals(pasword)) {
		
		return usu;		
		}
		return null;
		}
		return null;
		}
		return null;
	}
}
