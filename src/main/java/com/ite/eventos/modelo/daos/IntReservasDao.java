package com.ite.eventos.modelo.daos;

import java.util.List;

import com.ite.eventos.beans.Reservas;

public interface IntReservasDao {

	List<Reservas> findAll();
	
	Reservas findByUserEvent(int idEvento, int idUsuario);
	
	int addReserva(Reservas reserva);
}
