package edu.epn.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import edu.epn.modelo.dao.EstudianteDAO;
import edu.epn.modelo.entities.Estudiante;

public class JPAEstudianteDAO extends JPAGenericDAO<Estudiante, Integer>
implements EstudianteDAO {

	public JPAEstudianteDAO() {
		super(Estudiante.class);
	}

	@Override
	public List<Estudiante> getEstudiantesByDepartamento(int idDepartamento) {
		//Con JPQL
		Query query = this.em.createQuery("SELECT t.estudiante from Tutoria t WHERE t.profesor.departamento.id= :idDep");
		query.setParameter("idDep", idDepartamento);
		@SuppressWarnings("unchecked")
		List<Estudiante> resultado = query.getResultList();
		return resultado;
	}

	@Override
	public List<Estudiante> getEstudiantesByNombre(String nombre) {
		// CON NamedQuery
		Query query = em.createNamedQuery("findAllCustomersWithName");
		query.setParameter("custName", nombre);
		@SuppressWarnings("unchecked")
		List<Estudiante> res3 = query.getResultList();
		return res3;
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		//Con query normal SQL
		String sql = "SELECT usu_nombre, usu_apellido * FROM Usuario where usu_tipo='est'";
		Query query = em.createNativeQuery(sql);
		@SuppressWarnings("unchecked")
		List<Estudiante> res3 = query.getResultList();
		return res3;
	}

}
