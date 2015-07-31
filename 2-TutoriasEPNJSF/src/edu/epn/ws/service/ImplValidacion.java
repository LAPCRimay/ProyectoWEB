package edu.epn.ws.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.epn.modelo.entities.Usuario;

public class ImplValidacion implements IUsuario {

	@Override
	public Usuario validarPersona(String nombre, String clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saludo(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	// Crear el EntityManagerFactory
	//EntityManagerFactory emf;
	//Crear el EntityManager
	//EntityManager em = null;	
	//emf=Persistence.createEntityManagerFactory("2-TutoriasEPNJSF");
//	em=emf.createEntityManager();
	//Query q = em.createQuery("SELECT u FROM User u");
	//@Override
	/*public Usuario validarPersona(String nombre, String clave) {
		Usuario usuarioLogueado = new Usuario();
		/*try {
			Usuario u = (Usuario) query.getSingleResult();
			return u;
		} catch (NoResultException e){
			log.debug("Problemas para loguear al usuario % ", nombre, e);
			return null;
		}
		return null;
	}
*/
	/*@Override
	public String saludo(String nombre) {
		return "Hola " + nombre;
	}*/

}