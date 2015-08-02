package edu.epn.modelo.entities;
//
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Tutoria")
@NamedQuery(name="findAllTutoriasWithIDProfesor", query="SELECT t FROM Tutoria t WHERE t.profesor.id LIKE :custName")
public class Tutoria implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tut_codigo")
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tut_fecha")
	private Date fecha;
	
	@Column(name="hora_inicio")
	private String horaInicio;
	
	@Column(name="hora_fin")
	private String horaFin;
	
	@Column(name="tut_tematica")
	private String tematica;
	//Relaciones
	@ManyToOne(cascade={CascadeType.MERGE},fetch=FetchType.LAZY)
	@JoinColumn(name="pro_codigo")
	private Profesor profesor;
	@ManyToOne(cascade={CascadeType.MERGE},fetch=FetchType.LAZY)
	@JoinColumn(name="est_codigo")
	private Estudiante estudiante;
	
	public Tutoria(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Date getFecha() throws ParseException {
		//SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
		//return(formatoDeFecha.parse((String) fecha.toString().subSequence(0, 10)));
		return fecha;
}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	
	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Tutoria)) {
			return false;
		}
		Tutoria other = (Tutoria) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}
