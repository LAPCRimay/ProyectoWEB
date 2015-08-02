package edu.epn.modelo.dao;

import edu.epn.modelo.entities.Estudiante;
import edu.epn.modelo.entities.Profesor;
import edu.epn.modelo.entities.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	public Usuario verificarusuario(String username,String clave);
	public Estudiante verificarEstudiante(String username,String clave);
	public Profesor verificarProfesor(String username,String clave);
}
