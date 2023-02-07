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

		System.out.println("------------------------------------------");
		System.out.println(cc.leerUno("BR"));

		Country datos = cc.leerUno("BR");
		datos.setCountry_name("Se ha modificado");
		System.out.println("Afectados: " + cc.actualizar(datos));

		System.out.println("------------------------------------------");
		System.out.println(cc.leerUno("BR"));

		Country datos1 = cc.leerUno("BR");
		System.out.println("Borrando datos: " + cc.borrar(datos1));

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
