package com.ite.eventos.modelo.daos;

import java.util.List;

import com.ite.eventos.beans.Evento;

public interface IntEventoDao {
	
	
	List<Evento> findByEstado(String estado);
	
	List<Evento> findAll();
	
	List<Evento> findByDetacado(String destacado);
	
	Evento findById(int idEvento);
	
	int addEvento(Evento evento);
	
	int changeEvento(int idEvento,String estado);
	
	int deleteEvento(int idEvento);
	
	
	
	

}
