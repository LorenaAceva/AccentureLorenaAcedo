package EjercicioSíntaxisR;

/**
 * Comprobamos los errores que existen en la clase
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ComprobarErrores {
	/**
	 * Dejo sin refactorizar el código centrándome en el ejercicio
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Poner el ; tras alcance
		int $nombre;
		int pasado;
		int alcance;

		int _contador;
		_contador = 25;
		
		// El nombre de la variable pasado, debe estar escrito igual.
		$nombre = _contador;
		pasado = _contador;

		System.out.println($nombre + " / " + _contador);
	}

}
