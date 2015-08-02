package edu.epn.modelo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADM")
public class Administrador extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="adm_permiso")
	private String adm_nivelpermiso;
	public Administrador() {
		
	}
	public String getPermiso() {
		return adm_nivelpermiso;
	}
	public void setPermiso(String permiso) {
		this.adm_nivelpermiso = permiso;
	}
	@Override
	public String toString() {
		return "Administrador [permiso=" + adm_nivelpermiso + "]";
	}
	@Override
	public int hashCode() {
		int hash = 0;
		//hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		return true;
	}
	

}
