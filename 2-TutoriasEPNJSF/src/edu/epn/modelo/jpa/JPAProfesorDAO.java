package edu.epn.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import edu.epn.modelo.dao.ProfesorDAO;
import edu.epn.modelo.entities.Profesor;

public class JPAProfesorDAO extends JPAGenericDAO<Profesor, Integer>
implements ProfesorDAO{

	public JPAProfesorDAO() {
		super(Profesor.class);

	}

	@Override
	public List<Profesor> getProfesorByIdDepartamento1(int idDepartamento) {
		//Con JPQL
		Query query = this.em.createQuery("SELECT d.profesores FROM Departamento d WHERE d.id= :idDep");
		query.setParameter("idDep", idDepartamento);
		@SuppressWarnings("unchecked")
		List<Profesor> resultado = query.getResultList();
		return resultado;
		
		
	}

	
	@Override
	public List<Profesor> getProfesorByIdTutoria(int idDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

}
