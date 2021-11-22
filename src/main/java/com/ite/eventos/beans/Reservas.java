package com.ite.eventos.beans;

import java.io.Serializable;

public class Reservas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idReserva;
	private Evento evento;
	private Usuarios usuario;
	private double precioVenta;
	private String observaciones;
	private int cantidad;
	
	
	public Reservas() {
		super();
	}


	public Reservas(int idReserva, Evento evento, Usuarios usuario, double precioVenta, String observaciones,
			int cantidad) {
		super();
		this.idReserva = idReserva;
		this.evento = evento;
		this.usuario = usuario;
		this.precioVenta = precioVenta;
		this.observaciones = observaciones;
		this.cantidad = cantidad;
	}


	public int getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}


	public Evento getEvento() {
		return evento;
	}


	public void setEvento(Evento evento) {
		this.evento = evento;
	}


	public Usuarios getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Reservas [idReserva=" + idReserva + ", evento=" + evento + ", usuario=" + usuario + ", precioVenta="
				+ precioVenta + ", observaciones=" + observaciones + ", cantidad=" + cantidad + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idReserva;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reservas))
			return false;
		Reservas other = (Reservas) obj;
		if (idReserva != other.idReserva)
			return false;
		return true;
	}
	
	
	
}
