package edu.epn.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import edu.epn.modelo.dao.TutoriaDAO;

import edu.epn.modelo.entities.Tutoria;

public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer>
implements TutoriaDAO{

	public JPATutoriaDAO() {
		super(Tutoria.class);
	}

	@Override
	public List<Tutoria> getTutoriaByProfesor(int idProfesor) {
		Query query = this.em.createQuery("SELECT t FROM Tutoria t WHERE t.profesor.id LIKE :idPro");
		query.setParameter("idPro", idProfesor);
		@SuppressWarnings("unchecked")
		List<Tutoria> resultado = query.getResultList();
		return resultado;
	}

	@Override
	public List<Tutoria> getTutoriaByEstudiante(int idEstudiante) {
		return null;
	}

	@Override
	public List<Tutoria> getTutoriaByDepartamento(int idDepartamento) {
		return null;
	}

}
