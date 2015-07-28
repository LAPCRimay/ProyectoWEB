package edu.epn.ejecucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.epn.modelo.entities.Departamento;
import edu.epn.modelo.entities.Profesor;

public class Principal {

	public static void main(String[] args) {
		// Crear el EntityManagerFactory
		EntityManagerFactory emf;
		//Crear el EntityManager
		EntityManager em;
		emf=Persistence.createEntityManagerFactory("2-TutoriasEPNJSF");
		em=emf.createEntityManager();
		//PRUEBA SUBIDA
		//Creamos un departamento
		Departamento dep=new Departamento();
		dep.setNombre("Ingenieria de Software");
		
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
		
		
		Profesor profe=new Profesor();
		profe.setNombre("Pupo");
		
		//Insertamos el departamento
		
		em.getTransaction().begin();
		em.persist(profe);
		em.getTransaction().commit();

	}

}
