package edu.epn.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import edu.epn.modelo.dao.DAOFactory;
import edu.epn.modelo.entities.Tutoria;
import edu.epn.modelo.jpa.JPADAOFactory;

@ManagedBean(name="listarTutoria")
public class ListarTutoriasManagedBean {
	List<Tutoria> lista=new ArrayList<Tutoria>();
	
	public List<Tutoria> getLista() {
		return lista;
	}

	public void setLista(List<Tutoria> lista) {
		this.lista = lista;
	}

	public String getListaByProf(String idProfesor) {
		int idProf=Integer.parseInt(idProfesor);
		this.lista=JPADAOFactory.getFactory().getTutoriaDAO().getTutoriaByProfesor(idProf);
		return "tutoriasList";
	}
	
}
