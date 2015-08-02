package edu.epn.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.epn.modelo.dao.DAOFactory;
import edu.epn.modelo.entities.Tutoria;
import edu.epn.modelo.entities.Usuario;

@ManagedBean(name="Usuario")
@SessionScoped
public class VerificarUsuarioManagedBean {
	Usuario u=new Usuario();
	List<Tutoria> lista=new ArrayList<Tutoria>();
	String id;

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}
	public String verificarUsuario(){
		String resultado="";
		this.u=DAOFactory.getFactory().getUsuarioDAO().verificarusuario(u.getUsername(), u.getClave());		
		if(u!=null){
			if(DAOFactory.getFactory().getUsuarioDAO().verificarProfesor(u.getUsername(), u.getClave())!=null){
				this.id=u.getId().toString();
				resultado= "menuProfesor.xhtml";
			}
			else if(DAOFactory.getFactory().getUsuarioDAO().verificarEstudiante(u.getUsername(), u.getClave())!=null)
				resultado="menuEstudiante.xhtml";
		}
		else{
			resultado="error";
		}
		System.out.println("Resultado Verificar usuario: "+resultado);
		return resultado;

	}

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


}
