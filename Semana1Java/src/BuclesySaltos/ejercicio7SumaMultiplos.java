package BuclesySaltos;

/**
 * Calculamos la suma de los 10 primeros múltiplos de 5
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio7SumaMultiplos {

	public static void main(String[] args) {
		
		int contador = 10;
		long total = 0;
		int inicio = 0;

		while (contador > 0) {
			if (++inicio % 5 == 0) {
				--contador;
				total += inicio;
				System.out.println(inicio);
			}
		}
		System.out.println("El total es: " + total);
	}

}
