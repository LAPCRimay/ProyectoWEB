package edu.epn.ws;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private String username;
	private String pass;
	private String mensaje;
	private Boolean status;
	
	//CONSTRUCTOR
	public Usuario(){
		
	}
	//GETTERS AND SETTERS
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
