package epn.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import epn.modelo.Tutoria;
import epn.modelo.UsuarioServicio;

/**
 * Servlet implementation class ListarSolicitudes
 */
public class ListarSolicitudesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarSolicitudesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tematica;
		String fecha;
		String horaInicio;
		String horaFin;
		String id=request.getParameter("txtId");
		int idProfesor=Integer.parseInt(id.substring(0,id.length()-1));
		//LLAMAR AL MODELO
		Tutoria solicitudTutoria=new Tutoria();
		LinkedList<Tutoria> listaSolicitudes=solicitudTutoria.obtenerLista(idProfesor);
		/*MANDA EL OBJETO*/
		request.setAttribute("listaSolicitudes", listaSolicitudes);
		/*DIRECCIONA EL OBJETO*/
		if(listaSolicitudes!=null){
			/*LLAMADA A LA PAGINA MENU*/
			request.getRequestDispatcher("listarSolicitudes.jsp").forward(request, response);
			
		}else{

			/*LLAMADA A LA PAGINA DE ERROR*/
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
