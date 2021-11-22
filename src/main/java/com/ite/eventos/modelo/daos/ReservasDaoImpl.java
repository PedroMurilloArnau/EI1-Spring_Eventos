package com.ite.eventos.modelo.daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ite.eventos.beans.Reservas;

@Repository
public class ReservasDaoImpl implements IntReservasDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Reservas> lista;
	private static int contadorId;
	
	public ReservasDaoImpl() {
		lista = new ArrayList<Reservas>();
		contadorId = lista.size();
	}

	@Override
	public List<Reservas> findAll() {
		
		return lista;
	}

	@Override
	public Reservas findByUserEvent(int idEvento, int idUsuario) {
		
		return null;
	}

	@Override
	public int addReserva(Reservas reserva) {
		if (!lista.contains(reserva)){
			reserva.setIdReserva(++contadorId);
			lista.add(reserva);
		return 1;
		}
		return 0;
	}
	
}
