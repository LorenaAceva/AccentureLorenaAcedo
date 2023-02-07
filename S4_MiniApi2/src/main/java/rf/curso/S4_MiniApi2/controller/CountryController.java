package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;
import java.util.List;


import rf.curso.S4_MiniApi2.Model.Country;
import rf.curso.S4_MiniApi2.dao.CountryDao;



/**
 * Clase control, encargada de dar a la clase Main lo que solicita
 * 
 * Se realizará sobre la interface
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class CountryController {

	CountryDao cDao;

	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
	
	public Country leerUno(String country_id) throws Exception{
		return cDao.buscar(country_id);
	}

	public List<Country> leerTodos() throws Exception {
		return cDao.obtenerCountry();
	}
	
	public void actualizar(Country country) throws SQLException{
		cDao.editar(country);
	}
	
	public void borrar(Country country) throws SQLException{
		cDao.eliminar(country);
	}
	public void borrar(String country_id) throws SQLException{
		cDao.eliminar(country_id);
	}

}
