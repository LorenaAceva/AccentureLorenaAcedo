package Controller;

import java.sql.SQLException;
import java.util.List;

import Dao.CountryDao;
import Dao.CountryDaoI;
import Model.Country;

/**
 * Clase control, encargada de dar a la clase Main lo que solicita
 * 
 * Se realizará sobre la interface
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class CountryController {

	CountryDaoI cDao;

	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
	
	public Country leerUno(String country_id) throws Exception{
		return cDao.leerUno(country_id);
	}

	public List<Country> leerTodos() throws Exception {

		return cDao.leerTodos();
	}
	
	public int actualizar(Country country) throws SQLException{
		return cDao.actualizar(country);
	}
	
	public int borrar(Country country) throws SQLException{
		return cDao.delete(country);
	}
	public int borrar(String country_id) throws SQLException{
		return cDao.delete(country_id);
	}

}
