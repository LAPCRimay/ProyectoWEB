package edu.epn.modelo.dao;
import java.util.List;
import edu.epn.modelo.entities.Profesor;

public interface ProfesorDAO extends GenericDAO<Profesor, Integer>{
	public List<Profesor> getProfesorByIdDepartamento1(int idDepartamento);
	public List<Profesor> getProfesorByIdTutoria(int idDepartamento);
}
