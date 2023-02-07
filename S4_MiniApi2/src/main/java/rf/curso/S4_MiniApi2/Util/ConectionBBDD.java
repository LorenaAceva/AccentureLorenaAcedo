package rf.curso.S4_MiniApi2.Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * Conexión a la BBDD y consultas a tablas
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ConectionBBDD {

	/**
	 * Datos para la conexión a la BBDD elegida
	 */
	private static Connection conn;
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
	public final static String DATABASE = "";
	public final static String USUARIO = "hr";
	public final static String PASSWORD = "hr";


	public Connection abrir() throws SQLException {
		System.out.println("------------Conexión Activa---------");

		/**
		 * Cargar Driver
		 */

		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Dónde están los driver?");
			e.printStackTrace();
			return null;
		}
		System.out.println("Driver registrado");

		/**
		 * Conexión
		 */

		conn = null;
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Conexión fallida");
			e.printStackTrace();
			return null;
		}
		
		conn.setAutoCommit(false);
		return conn;
		
	}
	
}
