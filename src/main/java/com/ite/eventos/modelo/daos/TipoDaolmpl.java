package com.ite.eventos.modelo.daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ite.eventos.beans.Tipo;

public class TipoDaolmpl implements IntTipoDao, Serializable{
/**
 * 
 */
	private static final long serialVersionUID = 1L;
	
	private List<Tipo> lista;
	
	public TipoDaolmpl(){
		lista = new ArrayList<Tipo>();
		cargarDatos();
		
	}
	private void cargarDatos() {
		
		lista.add(new Tipo(1,"Concierto","multitudinario de entre 10 a 5000 personas"));
		lista.add(new Tipo(2,"Opera","acotado entre 10 a 500 personas"));
		lista.add(new Tipo(3,"Teatro","acotado de entre 10 a 500 personas"));
		
		
	}
	@Override
	public List<Tipo> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}
	@Override
	public int addTipo(Tipo tipo) {
		// TODO Auto-generated method stub
		if(!lista.contains(tipo)) {
			lista.add(tipo);
			return 1;
		}
		return 0;
	}
	
	@Override
	public Tipo findById(int idTipo) {
		Tipo tipo = new Tipo();
		tipo.setIdTipo(idTipo);
		int pos = lista.indexOf(tipo);
		if (pos == -1)
		return null;
		else
			return lista.get(pos);
	}
}
