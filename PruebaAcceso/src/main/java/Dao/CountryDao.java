package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Country;
import Util.ConectionBBDD;
import Util.MontadorSQL;

/**
 * Clase que tendrá los queries, el objeto conection y realizará los métodos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class CountryDao implements CountryDaoI {

	private Connection conn;

	public final static String SQL_LEER_TODOS_COUNTRY = "Select * from countries";
	public final static String SQL_LEER_COUNTRYID = "Select *from countries where country_id= ";
	public final static String SQL_BORRAR_COUNTRY = "Delete countries_MGG where country_id=?";

	/**
	 * Objeto para la conexión
	 * 
	 * @throws SQLException
	 */
	public CountryDao() throws SQLException {
		ConectionBBDD ora = new ConectionBBDD();
		conn = ora.abrir();
	}

	@Override
	public Country leerUno(String country_id) {

		return null;
	}

	/**
	 * Método para listar todos los paises Usaremos
	 * 
	 * ResultSet que nos ayudará a almacenar los datos de la consulta que hagamso
	 * con Statement
	 */
	@Override
	public List<Country> leerTodos() throws Exception {
		ResultSet rs = null;
		List<Country> salida = new ArrayList<>();
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS_COUNTRY);

			while (rs.next()) {
				salida.add(carga(rs));
			}
		} catch (SQLException e) {
			throw new Exception(SQL_LEER_TODOS_COUNTRY + " " + e.getMessage());
		}
		return salida;
	}

	/**
	 * Método para actualizar datos en country
	 */
	@Override
	public int actualizar(Country country) throws SQLException {
		String sql = "Update countries_Mgg set" + montaSqlU(country);
		sql += "where";
		sql = MontadorSQL.addSalida(sql, "country_id", country.getCountry_id(), " ");
		System.out.println(sql);
		Statement stm = conn.createStatement();
		return stm.executeUpdate(sql);
	}

	/**
	 * Método para borrar datos
	 */
	@Override
	public int delete(Country country) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_BORRAR_COUNTRY);
		ps.setString(1, country.getCountry_id());
		return ps.executeUpdate();
	}

	@Override
	public int delete(String country_id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_BORRAR_COUNTRY);
		ps.setString(1, country_id);
		return ps.executeUpdate();
	}

	/**
	 * Método para insertar datos
	 * 
	 * @throws SQLException
	 */
	@Override
	public Country insert(Country country) throws SQLException {
		String sql = "insert into countries_MGG set" + montaSqlI(country);
		sql += "where";
		sql = MontadorSQL.addSalida(sql, "country_id", country.getCountry_id(), " ");
		System.out.println(sql);
		Statement stm = conn.createStatement();
		stm.executeUpdate(sql);
		return country;
	}

	/**
	 * Creamos el método carga para añadir paises y devolverlo como un Country
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public Country carga(ResultSet rs) throws SQLException {
		Country ctr = new Country();
		ctr.setCountry_id(rs.getString("country_id"));
		ctr.setCountry_name(rs.getString("country_name"));
		ctr.setRegion_id(rs.getString("region_id"));
		return ctr;

	}

	/**
	 * Método que formará los Update
	 * 
	 * @param country
	 * @return
	 */
	public String montaSqlU(Country country) {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, "country_id", country.getCountry_id(), ",");
		salida = MontadorSQL.addSalida(salida, "country_name", country.getCountry_name(), ",");
		salida = MontadorSQL.addSalida(salida, "region_id", country.getRegion_id(), ",");
		return salida;
	}

	/**
	 * Método que formará los Insert
	 * 
	 * @param country
	 * @return
	 */
	public String montaSqlI(Country country) {
		String salida = "";
		salida = MontadorSQL.addSalida(salida, "", country.getCountry_id(), ",");
		salida = MontadorSQL.addSalida(salida, "", country.getCountry_name(), ",");
		salida = MontadorSQL.addSalida(salida, "", country.getRegion_id(), ",");
		return salida;
	}

}
