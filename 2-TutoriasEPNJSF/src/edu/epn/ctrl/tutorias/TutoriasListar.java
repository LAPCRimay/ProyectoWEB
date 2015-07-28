package edu.epn.ctrl.tutorias;

import java.util.List;

import javax.faces.bean.ManagedBean;

import edu.epn.modelo.entities.Profesor;
import edu.epn.modelo.entities.Tutoria;
import edu.epn.modelo.jpa.JPADAOFactory;

@ManagedBean
public class TutoriasListar {
	private List<Tutoria> tutoriasList;
	private Profesor profe=new Profesor();
	//Constructor
	public TutoriasListar(){

	}
	//Propiedades (Getters y Setters)

	public List<Tutoria> getTutoriasList() {
		//Si la lista no existe la inicializamos, caso contario
		//en la pantalla dará error!
		if(tutoriasList==null){
			tutoriasList=JPADAOFactory.getFactory().getTutoriaDAO().find();
		}
		return tutoriasList;
	}

	public void setTutoriasList(List<Tutoria> tutoriasList) {
		this.tutoriasList = tutoriasList;
	}

	//Acciones
	public List<Tutoria> listarPorProfesor(int idProfesor){
		
		//Si la lista no existe la inicializamos, caso contario
				//en la pantalla dará error!
				if(tutoriasList==null){
					//tutoriasList=JPADAOFactory.getFactory().getTutoriaDAO().find({this.profe}, idProfesor);
				}
				return tutoriasList;
	}
}
