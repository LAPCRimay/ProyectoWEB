package edu.epn.modelo.entities;
//
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("PRO")

//@Table(name="Docente")
@NamedQuery(name="findProfesor", query="SELECT p FROM Profesor as p WHERE p.username LIKE :userName and p.clave LIKE :clave")
public class Profesor extends Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="pro_codigo")
	//private Integer id;
	@Column(name="pro_numCedula")
	private String numeroCedula;
	@Column(name="pro_titulo")
	private String titulo;
	@Column(name="pro_titular")
	private Boolean titular;
	
	//Mapeando las relaciones
	@OneToMany(mappedBy="profesor")
	private List<Tutoria> tutorias;
	@ManyToOne(cascade={CascadeType.MERGE},fetch=FetchType.LAZY)
	@JoinColumn(name="dep_codigo")
	private Departamento departamento;
	
	
	
	public Profesor(){
		
	}

	

	public List<Tutoria> getTutorias() {
		return tutorias;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void setTutorias(List<Tutoria> tutorias) {
		this.tutorias = tutorias;
	}

	
	public String getNumeroCedula() {
		return numeroCedula;
	}



	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Boolean getTitular() {
		return titular;
	}



	public void setTitular(Boolean titular) {
		this.titular = titular;
	}


	@Override
	public String toString() {
		//return this.apellido+' '+this.nombre;
		return "";
	}

	@Override
	public int hashCode() {
		int hash = 0;
		//hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Profesor)) {
			return false;
		}
		/*Profesor other = (Profesor) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}*/
		return true;
	}
}
