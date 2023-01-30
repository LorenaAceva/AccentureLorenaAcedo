package Ejercicio1;

/**
 * Metod encargado de imprimir los datos introducidos por teclado
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ImprimirDatos {

	public static void main(String[] args) {
		PideTeclado datos = new PideTeclado();

		datos.pedirDatos();

		System.out.println(datos.getNombre() + " " + datos.getApellido());

	}

}
