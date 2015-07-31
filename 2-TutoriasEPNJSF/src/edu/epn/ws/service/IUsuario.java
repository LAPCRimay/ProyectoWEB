package edu.epn.ws.service;

import edu.epn.modelo.entities.Usuario;



public interface IUsuario {
		Usuario validarPersona(String nombre, String clave);
		
		String saludo(String nombre);
}
