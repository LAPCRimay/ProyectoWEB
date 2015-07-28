package epn.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrador
 * @version 1.0
 * @created 11-jun-2015 20:31:35
 */
public class ConexionBDD {

	private Connection conexion = null;
	private String servidor = "localhost";
	private String database = "tutoriaexamen";
	private String usuario = "root";
	private String password = "";
	private String url = "jdbc:mysql://" + servidor + "/" + database;

	public ConexionBDD() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Class.forName("com.mysql.jdbc.Driver");
			this.conexion = DriverManager.getConnection(url,
					usuario, password);
			if (conexion != null) {
				System.out.println("Conexion a Base de Datos " + url
						+ " . . . . .Ok");
			} else {
				System.out.println("Conexion FALLIDA " + url);
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		} 
	}

	public void finalize() throws Throwable {

	}

	public ResultSet consultar(String sql) {
		ResultSet resultado;
		try {
			System.out.println(sql);
			Statement sentencia = conexion.createStatement(
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			resultado = sentencia.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return resultado;
	}

	public boolean ejecutarSQL(String sql) {
		try {
			Statement sentencia = conexion.createStatement(
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			sentencia.executeUpdate(sql);
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param parametros
	 * @param storeName
	 *            Nombre del Procedimiento Almacenado
	 */
	public ResultSet ejecutarSpConsulta(String[] parametros, String storeName) {
		return null;
	}

	/**
	 * 
	 * @param parametros
	 * @param nombreSp
	 */
	public void ejecutarSpModificacion(String[] parametros, String nombreSp) {

	}

}