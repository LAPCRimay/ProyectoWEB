package edu.epn.modelo.dao;
import java.util.List;
import edu.epn.modelo.entities.Departamento;

public interface DepartamentoDAO extends GenericDAO<Departamento, Integer>{
	public List<Departamento> getDepartamento();
}
