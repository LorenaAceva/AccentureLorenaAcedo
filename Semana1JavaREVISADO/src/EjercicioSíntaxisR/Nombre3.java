package EjercicioSíntaxisR;

/**
 * Esta clase define variables para verificar la normativa de definición de las
 * variables en Java, como resultado se imprimirá en pantalla.
 * 
 * @author lorena.acedo.vazquez
 *
 */
public class Nombre3 {

	public static void main(String[] args) {

		int _contador= 25;
		
		int $nombre= _contador;;
		int pasado= _contador;// El nombre de la variable debe estar escrito igual.
		int alcance; // Poner el ; tras alcance
		
		System.out.println($nombre + " / " + _contador);
		System.out.println("En \"Java\" puede\n que tengamos que utilizar\n caracteres especiales");
	}

}
