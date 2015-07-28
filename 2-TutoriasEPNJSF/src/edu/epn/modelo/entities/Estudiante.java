package edu.epn.modelo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("EST")
//@Table(name="Estudiante")
public class Estudiante extends Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="est_codigo")
	//private Integer id;
	@Column(name="est_semestre")
	private String semestre;
	@Column(name="est_numUnico")
	private String numeroUnico;
	
	//Mapeando relaciones
	@OneToMany(mappedBy="estudiante")
	private List <Tutoria> tutorias;
	
	public Estudiante() {
		
	}
	
	public List<Tutoria> getTutorias() {
		return tutorias;
	}
	public void setTutorias(List<Tutoria> tutorias) {
		this.tutorias = tutorias;
	}
		
	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	@Override
	public String toString() {
		//return Usuario().apellido+' '+this.nombre;
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
		/*if (!(object instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) object;
		if ((o.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}*/
		return true;
	}
	
}
