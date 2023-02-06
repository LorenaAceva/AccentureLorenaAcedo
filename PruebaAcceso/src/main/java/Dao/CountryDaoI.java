package Dao;

import java.sql.SQLException;
import java.util.List;

import Model.Country;

public interface CountryDaoI {
	
	public Country leerUno(String country_id);
	public List<Country> leerTodos()throws Exception;
	public int actualizar(Country country) throws SQLException;
	public int delete (Country country) throws SQLException;
	public int delete (String country_id) throws SQLException;
	public Country insert (Country country) throws SQLException;
	

}
