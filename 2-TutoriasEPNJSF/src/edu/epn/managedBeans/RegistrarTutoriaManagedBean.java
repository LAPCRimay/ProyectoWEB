package edu.epn.managedBeans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;

import edu.epn.modelo.entities.Profesor;
import edu.epn.modelo.entities.Tutoria;
import edu.epn.modelo.jpa.JPADAOFactory;

@ManagedBean(name="registrarTutoria")
public class RegistrarTutoriaManagedBean {
	List<Profesor> profesores=new ArrayList<Profesor>();
	private ArrayList<SelectItem> listaProfesores=new ArrayList<SelectItem>();

	private String profesorSeleccionado=new String();
	private Date fecha;

	public RegistrarTutoriaManagedBean() {

	}
	

	 public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public void onDateSelect(SelectEvent event) {
	        FacesContext facesContext = FacesContext.getCurrentInstance();
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
	    }
	 
	 public ArrayList<SelectItem> getListaProfesores() {

		this.profesores = JPADAOFactory.getFactory().getProfesorDAO().find();
		listaProfesores.clear();
		for(int i=0; i<profesores.size(); i++)
		{
			Profesor pro = new Profesor();
			pro = (Profesor)profesores.get(i);

			listaProfesores.add(new SelectItem(pro.getId(),pro.getNombre().toUpperCase()+' '+pro.getApellido().toUpperCase()));
		}      
		return listaProfesores;
	}

	public String getProfesorSeleccionado() {
		return profesorSeleccionado;
	}

	public void setProfesorSeleccionado(String profesorSeleccionado) {
		this.profesorSeleccionado = profesorSeleccionado;
	}

	public void setListaProfesores(ArrayList<SelectItem> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

}
