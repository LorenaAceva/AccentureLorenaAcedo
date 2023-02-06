package Util;

import java.util.List;

import Controller.CountryController;
import Model.Country;

public class Main {

	/**
	 * Se solicita a la clase Controlador que nos presente la lista de paises
	 * 
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws Exception {
		
		CountryController cc = new CountryController();
		List<Country> ll = cc.leerTodos();
		listarCtr(ll);
	}

	/**
	 * Litará e imprimirá la lista de paises
	 * 
	 * @param ctr
	 */
	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}

}
