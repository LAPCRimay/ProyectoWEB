package edu.epn.modelo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="usu_tipo")
@NamedQuery(name="findUsuarioTipo", query="SELECT u FROM Usuario as u WHERE u.username LIKE :userName and u.clave LIKE :clave and TYPE(u) = :EST")
public class  Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usu_codigo")
	private Integer id;
	@Column(name="usu_nombre")
	private String nombre;
	@Column(name="usu_apellido")
	private String apellido;
	@Column(name="usu_correo")
	private String correo;
	@Column(name="usu_clave")
	private String clave;
	@Column(name="usu_username")
	private String username;

	public Usuario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido.toUpperCase();
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	/*@Transient
	public String getDecriminatorValue() {
	    return this.getClass().getAnnotation(DiscriminatorValue.class).value();
	}*/

}
