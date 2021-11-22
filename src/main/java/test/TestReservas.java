package test;


import com.ite.eventos.beans.Reservas;

import com.ite.eventos.modelo.daos.EventoDaolmpl;
import com.ite.eventos.modelo.daos.IntEventoDao;

import com.ite.eventos.modelo.daos.IntUsuariosDao;

import com.ite.eventos.modelo.daos.UsuariosDaolmpl;

public class TestReservas {

	public static void main(String[] args) {
		
		IntEventoDao eve = new EventoDaolmpl();
		IntUsuariosDao usu = new UsuariosDaolmpl();
		// TODO Auto-generated method stub
		
		Reservas reserva = new Reservas();
		reserva.setEvento(eve.findById(1));
		reserva.setUsuario(usu.findById(1));
		
			System.out.println(reserva.getEvento());
			System.out.println(reserva.getUsuario());
	}

}
