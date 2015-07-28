package edu.epn.modelo.dao;
import java.util.List;
import edu.epn.modelo.entities.Tutoria;


public interface TutoriaDAO extends GenericDAO<Tutoria,Integer>{
	public List<Tutoria> getTutoriaByProfesor(int idProfesor);
	public List<Tutoria> getTutoriaByEstudiante(int idProfesor);
	public List<Tutoria> getTutoriaByDepartamento(int idDepartamento);
}
