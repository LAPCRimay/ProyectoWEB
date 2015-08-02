package edu.epn.modelo.dao;

import java.util.List;

import edu.epn.modelo.entities.Estudiante;

public interface EstudianteDAO extends GenericDAO<Estudiante, Integer> {

	public List<Estudiante> getEstudiantesByDepartamento(int idDepartamento);
	public List<Estudiante> getEstudiantesByNombre(String nombre);
	//public List<Estudiante>getEstudianteByProfesor(int idProfesor);
	public Estudiante getEstudianteByID(int id);
	public List<Estudiante> getEstudiantes();
}
