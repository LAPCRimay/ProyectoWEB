package edu.epn.ctrl.menu;

import javax.faces.bean.ManagedBean;
//PROBANDO LAPC HDCR
@ManagedBean
public class MenuOrm {
	//CONSTRUCTOR
	public MenuOrm(){

	}

	//ACCIONES
	public String gestionTutorias(){
		return "tutoriasList";
	}
}
