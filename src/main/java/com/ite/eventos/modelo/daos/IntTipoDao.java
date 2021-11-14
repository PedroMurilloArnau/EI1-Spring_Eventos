package com.ite.eventos.modelo.daos;

import java.util.List;

import com.ite.eventos.beans.Tipo;

public interface IntTipoDao {
	
	List<Tipo> findAll();
	
	int addTipo(Tipo tipo);
	
	Tipo findById(int idTipo);

}

