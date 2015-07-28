package edu.epn.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import edu.epn.modelo.dao.DepartamentoDAO;
import edu.epn.modelo.entities.Departamento;

public class JPADepartamentoDAO extends JPAGenericDAO<Departamento, Integer>
 implements DepartamentoDAO{

	public JPADepartamentoDAO() {
		super(Departamento.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Departamento> getDepartamento() {
		//Con query normal SQL
				String sql = "SELECT * FROM Departamento";
				Query query = em.createNativeQuery(sql);
				@SuppressWarnings("unchecked")
				List<Departamento> res3 = query.getResultList();
				return res3;
	}

}
