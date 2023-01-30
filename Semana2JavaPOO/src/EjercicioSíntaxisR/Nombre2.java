package EjercicioSíntaxisR;

/**
 * Corregimos los errores del ejercicio, y se anota su explicación 
 * 
 * Se refactoriza el código
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Nombre2 {

	public static void main(String[] args) {

		int _contador= 25;
		
		int $nombre= _contador;;
		int pasado= _contador;// El nombre de la variable debe estar escrito igual.
		int alcance; // Poner el ; tras alcance


		System.out.println($nombre + " / " + _contador);
	}

}
