package edu.epn.modelo.jpa;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import edu.epn.modelo.dao.UsuarioDAO;
import edu.epn.modelo.entities.Estudiante;
import edu.epn.modelo.entities.Profesor;
import edu.epn.modelo.entities.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO{

	public JPAUsuarioDAO() {
		super(Usuario.class);
	}

	@Override
	public Usuario verificarusuario(String username, String clave) {		
		try{
	        Query query = this.em.createQuery("SELECT u FROM Usuario u WHERE u.username LIKE :userName and u.clave LIKE :clave");
	        query.setParameter("userName", username);
			query.setParameter("clave", clave);
			return (Usuario) query.getSingleResult();
	    } catch(NoResultException e) {
	        return null;
	    }
	}

	@Override
	public Estudiante verificarEstudiante(String username, String clave) {
		try{
	        Query query = this.em.createQuery("SELECT e FROM Estudiante as e WHERE e.username LIKE :userName and e.clave LIKE :clave");
	        query.setParameter("userName", username);
			query.setParameter("clave", clave);
			Estudiante est=(Estudiante) query.getSingleResult();
			return est;
	    } catch(NoResultException e) {
	        return null;
	    }
	}

	@Override
	public Profesor verificarProfesor(String username, String clave) {
		try{
	        Query query = this.em.createQuery("SELECT p FROM Profesor as p WHERE p.username LIKE :userName and p.clave LIKE :clave");
	        query.setParameter("userName", username);
			query.setParameter("clave", clave);
			Profesor pro=(Profesor) query.getSingleResult();
			return pro;
	    } catch(NoResultException e) {
	        return null;
	    }
	}

}
