package epn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import epn.modelo.UsuarioServicio;

/**
 * Servlet implementation class AutenticarServlet
 */
@WebServlet("/AutenticarServlet")
public class AutenticarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("txtUsuario");
		String clave=request.getParameter("txtClave");
		
		//LLAMAR AL MODELO
		UsuarioServicio usuario = new UsuarioServicio();
		UsuarioServicio userServicios = usuario.autenticar(nombre, clave);
		
		/*ENVIAR EL MODELO A LA VISTA*/
		/*MANDA EL OBJETO*/
		request.setAttribute("usuario", userServicios);
		
		/*DIRECCIONA EL OBJETO*/
		if(userServicios!=null){
			/*LLAMADA A LA PAGINA MENU*/
			request.getRequestDispatcher("menu_orm.xhtml").forward(request, response);
			
		}else{

			/*LLAMADA A LA PAGINA DE ERROR*/
			request.getRequestDispatcher("error.xhtml").forward(request, response);
		}
		
	}

}
