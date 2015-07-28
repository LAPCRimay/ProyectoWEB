package epn.modelo;

import java.sql.ResultSet;
import java.util.LinkedList;

public class Tutoria {
	private int idProfesor;
	private int idEstudiante;
	private String tematica;
	private String fecha;
	private String horaInicio;
	private String horaFin;
	
	Tutoria solicitud= null;
	
	
	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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

		
	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public Tutoria getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Tutoria solicitud) {
		this.solicitud = solicitud;
	}
	
	public Tutoria (){
		
	}
	public Tutoria(String tematica, String fecha, String horaInicio, String horaFin,
			Tutoria solicitud, int idProfesor,int idEstudiante) {
		super();
		this.tematica = tematica;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.solicitud = solicitud;
		this.idProfesor = idProfesor;
		this.idEstudiante = idEstudiante;
	}

	public LinkedList<Tutoria> obtenerLista(int idProfesor)
	   {
	      LinkedList<Tutoria> listaSolicitudes=new LinkedList<Tutoria>();
	      try
	      {
	         /*Class.forName("com.mysql.jdbc.Driver");*/
	         ConexionBDD cnn= new ConexionBDD();
	         ResultSet rs = cnn.consultar("SELECT * FROM tutoria WHERE PROFESOR_ID='"+Integer.toString(idProfesor)+"'" );
	         while (rs.next())
	         {
	        	Tutoria listaS = new Tutoria();
	            listaS.setIdProfesor(rs.getInt("PROFESOR_ID"));
	            listaS.setIdEstudiante(rs.getInt("ESTUDIANTE_ID"));
	            listaS.setFecha(rs.getString("TUT_FECHA"));
	            listaS.setHoraInicio(rs.getString("TUT_HORAINICIO"));
	            listaS.setHoraFin(rs.getString("TUT_HORAFIN"));
	            listaS.setTematica(rs.getString("TUT_TEMATICA"));
	            listaSolicitudes.add(listaS);
	         }
	         rs.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      return listaSolicitudes;
	   }  
	
}
