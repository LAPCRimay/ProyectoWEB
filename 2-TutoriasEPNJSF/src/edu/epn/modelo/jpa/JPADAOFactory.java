 package edu.epn.modelo.jpa;

 import edu.epn.modelo.dao.*;


public class JPADAOFactory extends DAOFactory{

	@Override
	public EstudianteDAO getEstudianteDAO() {
		return new JPAEstudianteDAO();
	}

	@Override
	public ProfesorDAO getProfesorDAO() {
		return new JPAProfesorDAO();
	}

	@Override
	public TutoriaDAO getTutoriaDAO() {
		return new JPATutoriaDAO();
	}

	@Override
	public DepartamentoDAO getDepartamentoDAO() {
		return new JPADepartamentoDAO();
	}

	@Override
	public AdministradorDAO getAdministradorDAO() {
		return new JPAAdministradorDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}

	
}
