package edu.epn.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import edu.epn.modelo.entities.Estudiante;
import edu.epn.modelo.entities.Profesor;
import edu.epn.modelo.entities.Tutoria;
import edu.epn.modelo.jpa.JPADAOFactory;

@ManagedBean(name="registrarTutoria")
@SessionScoped
public class RegistrarTutoriaManagedBean {
	List<Profesor> profesores=new ArrayList<Profesor>();
	private Tutoria tutoria=new Tutoria();
	private Estudiante estudianteSolicitante=new Estudiante();
	private Profesor profesorSeleccionado=new Profesor();

	public RegistrarTutoriaManagedBean() {

	}
	/*public void onDateSelect(SelectEvent event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
	}*/
	public String cancelar(){
		System.out.println("PPPPPPPPPPPPPPPPPPPPPPP  Profesor Seleccioonado: ");
		return "menuEstudiante.xhtml";
	}

	public List<Profesor> getProfesores() {
		return JPADAOFactory.getFactory().getProfesorDAO().find();
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	public Tutoria getTutoria() {
		return tutoria;
	}


	public void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}

	//ACCIONES
	public String guardar(){
		//Referencia al modelo para guardar la tutoria
		tutoria.setProfesor(this.profesorSeleccionado);
		tutoria.setEstudiante(this.estudianteSolicitante);
		JPADAOFactory.getFactory().getTutoriaDAO().create(this.tutoria);
		System.out.println("Se ha guardado :D POR FIN! ");
		return "menuEstudiante";
	}



	public String registrar(){
		return "tutoriaRegistrar";
	}
	
	public Estudiante getEstudianteSolicitante() {
		return JPADAOFactory.getFactory().getEstudianteDAO().getEstudianteByID(1);
	}
	public void setEstudianteSolicitante(Estudiante estudianteSolicitante) {
		this.estudianteSolicitante = estudianteSolicitante;
	}
	public Profesor getProfesorSeleccionado() {
		if(this.profesorSeleccionado==null){
			return this.profesorSeleccionado=new Profesor();
		}else
		return profesorSeleccionado;
	}
	public void setProfesorSeleccionado(Profesor profesorSeleccionado) {
		this.profesorSeleccionado = profesorSeleccionado;
	}

}
