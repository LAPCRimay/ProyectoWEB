package edu.epn.managedBeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import edu.epn.modelo.entities.Tutoria;
import edu.epn.modelo.jpa.JPADAOFactory;

@ManagedBean(name="listarTutoria")
@SessionScoped
public class ListarTutoriasManagedBean {
	List<Tutoria> lista=new ArrayList<Tutoria>();
	String id;
	public List<Tutoria> getLista() {
		return lista;
	}

	public void setLista(List<Tutoria> lista) {
		this.lista = lista;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getListaByProf() {
		//this.lista=DAOFactory.getFactory().getTutoriaDAO().getTutoriaByProfesor(3);
		int idProf=Integer.parseInt(id);
		this.lista=JPADAOFactory.getFactory().getTutoriaDAO().getTutoriaByProfesor(idProf);
		return "tutoriasList";
	}
	public void attrListener(ActionEvent event){
		 
		id = (String)event.getComponent().getAttributes().get("idprof");
	 
	  }
	
}
