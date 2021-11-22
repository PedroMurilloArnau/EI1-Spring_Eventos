package test;

import com.ite.eventos.beans.Evento;
import com.ite.eventos.modelo.daos.EventoDaolmpl;
import com.ite.eventos.modelo.daos.IntEventoDao;



public class TestEventos {

	public static void main(String[] args) {
		
		IntEventoDao edao = new EventoDaolmpl();
		String dar = "s";
		
		System.out.println("======== Pruebas de Destacado ========");
		for (Evento ele: edao.findByDetacado(dar))
			System.out.println(ele);
		
		System.out.println("======== Pruebas de Modificacion de Eventos ========");
		edao.changeEvento(1, "cancelado");
		edao.deleteEvento(2);
		
		System.out.println("======== Pruebas de findAll ========");
		for (Evento ele: edao.findAll())
			System.out.println(ele);
		
		System.out.println("======== Pruebas de findById ========");
			System.out.println(edao.findById(1));
			String der = "Activo";
			
			System.out.println("======== Pruebas de Estado ========");
		for (Evento ele: edao.findByEstado(der))
			System.out.println(ele);

	}

}
