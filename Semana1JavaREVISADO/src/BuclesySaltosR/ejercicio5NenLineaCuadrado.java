package BuclesySaltosR;

/**
 * Recibimos una colección de números y calculamos su cuadrado e imprimimos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio5NenLineaCuadrado {

	public static void main(String[] args) {

		int num;
		int cuadrado;

		// Entrada de datos por run configurations (argumentos)
		for (String nums : args) {
			num = Integer.parseInt(nums);// Convertimos a números
			cuadrado = num * num;// Calculamos el cuadrado de un número
			System.out.println("El cuadrado del número: " + num + " es igual a " + cuadrado);
		}
	}

}
