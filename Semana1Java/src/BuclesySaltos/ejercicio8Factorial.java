package BuclesySaltos;

/**
 * Realizamos el factorial del número 8
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio8Factorial {

	public static void main(String[] args) {

		double factorial = 1;
		int num = 8;

		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}

		System.out.println("El factorial del número " + num + " es: " + factorial);
	}

}
