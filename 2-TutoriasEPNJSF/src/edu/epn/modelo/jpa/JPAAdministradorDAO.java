package edu.epn.modelo.jpa;

import edu.epn.modelo.dao.AdministradorDAO;
import edu.epn.modelo.entities.Administrador;

public class JPAAdministradorDAO extends JPAGenericDAO<Administrador, Integer> implements AdministradorDAO{

	public JPAAdministradorDAO() {
		super(Administrador.class);
	}

}
