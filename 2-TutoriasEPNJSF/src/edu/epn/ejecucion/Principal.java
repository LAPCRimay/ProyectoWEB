package edu.epn.ejecucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.epn.modelo.entities.Administrador;
import edu.epn.modelo.entities.Departamento;
import edu.epn.modelo.entities.Estudiante;
import edu.epn.modelo.entities.Profesor;

public class Principal {

	public static void main(String[] args) {
		// Crear el EntityManagerFactory
		EntityManagerFactory emf;
		//Crear el EntityManager
		EntityManager em;
		emf=Persistence.createEntityManagerFactory("2-TutoriasEPNJSF");
		em=emf.createEntityManager();
		

		
		Estudiante e=new Estudiante();
		e.setNombre("Ana");
		e.setApellido("Paredes");
		e.setClave("1234");
		e.setUsername("est1");
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();

		
		

	}

}
