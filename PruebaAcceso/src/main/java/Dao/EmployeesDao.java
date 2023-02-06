package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Employees;
import Util.ConectionBBDD;
import java.sql.Connection;

public class EmployeesDao implements EmployeesDaoI {

	private Connection conn;// Iniciamos conexión

	public final static String SQL_LEER_TODOS_EMPLEADOS = "Select * from Employees";

	/**
	 * Objeto para la conexión
	 * 
	 * @throws SQLException
	 */
	public EmployeesDao() throws SQLException {
		ConectionBBDD ora = new ConectionBBDD();
		conn = ora.abrir();
	}

	@Override
	public Employees leerUno(int employees_id) {
		
		return null;
	}

	/**
	 * Lectura del nombre y apellido de la tabla empleados
	 * 
	 * @throws SQLException
	 */
	@Override
	public List<Employees> leerTodosEmpleados() throws Exception {
		ResultSet rs = null;
		List<Employees> salida = new ArrayList<>();
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS_EMPLEADOS);

			while (rs.next()) {
				System.out.println(rs.getString("First_name") + " " + rs.getString("last_name"));
			}
		} catch (SQLException e) {
			throw new Exception(SQL_LEER_TODOS_EMPLEADOS + "" + e.getMessage());
		}
		return salida;

	}

	@Override
	public int actualizar(Employees employees) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Employees employees) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int employees_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employees insert(Employees employees) {
		// TODO Auto-generated method stub
		return null;
	}

}
