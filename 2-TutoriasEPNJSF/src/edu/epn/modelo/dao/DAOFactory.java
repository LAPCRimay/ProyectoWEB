package edu.epn.modelo.dao;

import edu.epn.modelo.jpa.*;


public abstract class DAOFactory {
    // Sería mejor por inyección de objetos
    protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getFactory() {
        return factory;
    }

    public abstract EstudianteDAO getEstudianteDAO();
    public abstract ProfesorDAO getProfesorDAO();
    public abstract TutoriaDAO getTutoriaDAO();
    public abstract DepartamentoDAO getDepartamentoDAO();
    public abstract AdministradorDAO getAdministradorDAO();

}