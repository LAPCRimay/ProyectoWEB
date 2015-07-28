package epn.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioServicio {
	
	private String nombre;
	private String clave;
	private String username;
	private int idUsuario;
	
	UsuarioServicio user=null;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public UsuarioServicio autenticar(String username, String clave){
		ConexionBDD cnn= new ConexionBDD();
		ResultSet resultado=cnn.consultar("SELECT * FROM usuario WHERE USU_USERNAME='"+username+ "' AND USU_CLAVE='"+clave+"'");
		try {
			while(resultado.next()){
				user=new UsuarioServicio();
				user.setClave(resultado.getString("USU_CLAVE"));
				user.setNombre(resultado.getString("USU_NOMBRE"));
				user.setUsername(resultado.getString("USU_USERNAME"));
				user.setIdUsuario(resultado.getInt("USU_ID"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
		
		
		
	/*	if(username.equals("admin") && clave.equals("admin")){
			return true;
		}
		else
			return false;
	}*/

		
	
}
