package com.ite.eventos.modelo.daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ite.eventos.beans.Evento;




@Repository 
public class EventoDaolmpl implements IntEventoDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<Evento> lista;
	private static int contadorId;
	
	public EventoDaolmpl() {
		lista = new ArrayList<Evento>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		
		IntTipoDao tipod = new TipoDaolmpl();
		
		lista.add(new Evento(1, "El Loquillo","Concierto Rock",new Date(),2,"Estadio olimpico","Activo","s",3000,300,50,tipod.findById(1)));
		lista.add(new Evento(2, "Tequila prime","Concierto Rock",new Date(),3,"Descampado del cerro","Activo","s",3000,300,50,tipod.findById(1)));
		lista.add(new Evento(3, "Cocodrilo Opereta","Opera Rock",new Date(),2,"Sala Barquillo","Activo","n",300,50,200,tipod.findById(2)));
		lista.add(new Evento(4, "El cantar de Luisa","Opera Clasica",new Date(),3,"Teatro de la Opera","Activo","s",500,100,100,tipod.findById(2)));
		lista.add(new Evento(5, "Sueño de una noche de verano","Teatro Clasico",new Date(),4,"Teatro de la Latina","Activo","s",500,50,45,tipod.findById(3)));
		lista.add(new Evento(6, "El brillo de tus ojos","Teatro Conceptual",new Date(),2,"Teatro del cantata","Activo","n",200,10,20,tipod.findById(3)));
		
		contadorId = lista.size();
		
	}

	@Override
	public List<Evento> findByEstado(String estado) {
		List<Evento> aux = new ArrayList<Evento>();
		for (Evento eve: lista) {
			if(eve.getEstado().equals(estado));{
			aux.add(eve);
			}
		}
		lista = aux;
		return lista;
	}

	@Override
	public List<Evento> findAll() {
	
		return lista;
	}

	@Override
	public List<Evento> findByDetacado(String destacado) {
		List<Evento> aux = new ArrayList<Evento>();
		for (Evento eve: lista) {
			if(eve.getDestacado().equals(destacado)) {
			aux.add(eve);
		}
		}
		lista = aux;
		return lista;
	}

	@Override
	public Evento findById(int idEvento) {
		Evento aux = new Evento();
		aux.setIdEvento(idEvento);
		int pos = lista.indexOf(aux);
		if (pos == -1) //No la ha encontrado.
			return null;
		else
			return lista.get(pos);
	}

	@Override
	public int addEvento(Evento evento) {
		if (!lista.contains(evento)) {
			evento.setIdEvento(contadorId+1);
		lista.add(evento);
		return 1;
		}
		return 0;
	}

	@Override
	public int changeEvento(int idEvento, String estado) {
		
		Evento evento = findById(idEvento);
		evento.setEstado(estado);
		return 1;
	}
	

	@Override
	public int deleteEvento(int idEvento) {
		
		Evento evento = new Evento();
		evento.setIdEvento(idEvento);
		int pos = lista.indexOf(evento);
		return (lista.remove(pos) != null)? 1 : 0;
	}
	
	

}
