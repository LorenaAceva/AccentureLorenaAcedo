package rf.curso.S4_MiniApi2;

import java.util.List;

import rf.curso.S4_MiniApi2.Model.Country;
import rf.curso.S4_MiniApi2.controller.CountryController;


/**
 * Hello world!
 *
 */
public class App 
{
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
		cc.actualizar(datos);
		System.out.println("Afectados: ");

		System.out.println("------------------------------------------");
		System.out.println(cc.leerUno("BR"));

		Country datos1 = cc.leerUno("BR");
		cc.borrar(datos1);
		System.out.println("Borrando datos: ");

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
