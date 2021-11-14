package com.ite.eventos.beans;

import java.io.Serializable;
import java.util.Date;

public class Usuarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private String userName;
	private String pasword;
	private String email;
	private String nombre;
	private String direccion;
	private int enable;
	private Date fechaRegistro;
	
	public Usuarios() {
		super();
	}

	public Usuarios(int idUsuario, String userName, String pasword, String email, String nombre, String direccion,
			int enable, Date fechaRegistro) {
		super();
		this.idUsuario = idUsuario;
		this.userName = userName;
		this.pasword = pasword;
		this.email = email;
		this.nombre = nombre;
		this.direccion = direccion;
		this.enable = enable;
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUsuario;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Usuarios))
			return false;
		Usuarios other = (Usuarios) obj;
		if (idUsuario != other.idUsuario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", userName=" + userName + ", pasword=" + pasword + ", email="
				+ email + ", nombre=" + nombre + ", direccion=" + direccion + ", enable=" + enable + ", fechaRegistro="
				+ fechaRegistro + "]";
	}
	
	
	

}
