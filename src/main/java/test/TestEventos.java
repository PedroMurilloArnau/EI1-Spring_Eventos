package test;

import com.ite.eventos.beans.Evento;
import com.ite.eventos.modelo.daos.EventoDaolmpl;
import com.ite.eventos.modelo.daos.IntEventoDao;



public class TestEventos {

	public static void main(String[] args) {
		IntEventoDao edao = new EventoDaolmpl();
		edao.changeEvento(1, "cancelado");
		edao.deleteEvento(2);
		
		for (Evento ele: edao.findAll())
			System.out.println(ele);
		
			System.out.println(edao.findById(1));
	}

}
