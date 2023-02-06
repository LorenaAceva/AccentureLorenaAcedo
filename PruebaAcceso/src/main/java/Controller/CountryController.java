package Controller;

import java.sql.SQLException;
import java.util.List;

import Dao.CountryDao;
import Model.Country;

/**
 * Clase control, encargada de dar a la clase Main lo que solicita
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class CountryController {

	CountryDao cDao;

	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}

	public List<Country> leerTodos() throws Exception {

		return cDao.leerTodos();
	}

}
