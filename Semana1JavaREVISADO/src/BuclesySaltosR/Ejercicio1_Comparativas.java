package BuclesySaltosR;

/**
 * Comparamos si dos números son mayores o iguales.
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Ejercicio1_Comparativas {

	public static void main(String[] args) {

		int v1 = 10;
		int v2 = 20;
		
		/**
		 * Introducimos condicional if para la comparativa
		 */
		if (v1 == v2)
			System.out.println("Son iguales");
		else {
			if (v1 > v2)
				System.out.println(v1 + " es mayor que " + v2);
			else
				System.out.println(v2 + " es mayor que " + v1);
		}
		
		/**
		 * Calculamos si son múltiplos
		 */
		if (v1 % v2 == 0)
			System.out.println("Son múltiplos");
		else
			System.out.println("No son múltiplos");

	}

}
