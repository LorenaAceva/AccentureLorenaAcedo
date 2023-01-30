package BuclesySaltosR;

/**
 * Averiguamos la nomenclatura de la nota al introducir el valor numérico
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Ejercicio2_Notas {

	public static void main(String[] args) {

		int nota = 7;

		if (nota >= 0 && nota < 5)
			System.out.println("INSUFICIENTE");
		else if (nota == 5)
			System.out.println("SUFICIENTE");
		else if (nota == 6)
			System.out.println("BIEN");
		else if (nota == 7 || nota == 8)
			System.out.println("NOTABLE");
		else if (nota == 9 || nota == 10)
			System.out.println("SOBRESALIENTE");
	}

}
