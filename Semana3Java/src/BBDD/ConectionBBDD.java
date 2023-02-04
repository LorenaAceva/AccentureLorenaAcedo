package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Pruebas de conexión a una BBDD y consultas a tablas
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

	/**
	 * Constante con query de consulta a la tabla de Empleados y Paises de la BBDD a la que
	 * nos hemos conectado
	 */
	public final static String SQL_LEER = "Select * from Employees";
	public final static String SQL_LEER_COUNTRY = "Select * from Countries";

	public static void main(String[] argv) throws SQLException {
		System.out.println("------------Conexión Activa---------");

		/**
		 * Cargar Driver
		 */

		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Dónde están los driver?");
			e.printStackTrace();
			return;
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
			return;
		}
		lecturaEmpleados();
		if (conn != null) {
			System.out.println("Tienes el Control de la BBDD");
			conn.close();
		} else {
			System.out.println("Fallo la conexión");
		}
		lecturaCountry();
	}

	/**
	 * Lectura del nombre y apellido de la tabla empleados
	 * 
	 * @throws SQLException
	 */
	
	public static void lecturaEmpleados() throws SQLException {
		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER);

			while (rs.next()) {
				System.out.println(rs.getString("First_name") + " " + rs.getString("last_name"));
			}
		} catch (SQLException e) {
			System.out.println(null + "" + e.getMessage());
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}
	/**
	 * Lectura de paises
	 * @throws SQLException
	 */
	public static void lecturaCountry() throws SQLException {
		
		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRY);

			while (rs.next()) {
				Country ctr= new Country();
				ctr.setCountry_id(rs.getString("country_id"));
				ctr.setCountry_name(rs.getString("country_name"));
				ctr.setRegion_id(rs.getNString("region_id"));
				listarCtr(ctr);
				
			}
		} catch (SQLException e) {
			System.out.println(null + "" + e.getMessage());
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}
	/**
	 * Listamos los paises por id
	 * @param ctr
	 */
	public static void listarCtr(Country ctr) {
		System.out.println(ctr.getCountry_id());
	}
}
