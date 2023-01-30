package BuclesySaltos;

/**
 * Mostramos cuantos números primos hay entre el 1 y el 10 y decimos cuales son.
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio11Primos {

	public static void main(String[] args) {

		boolean primo;
		int inicio = 0;
		int num = 100;
		
		//Bucle para recorrer del 1 al 100
		for (int i = 1; i <= num; i++) {
			primo = true;
			int j = 2;
			//Cálculo del número primo
			while (j <= (i / 2) - 1 && primo == true) {
				if (i % j == 0)
					primo = false;
				j++;

			}
			//Imprimimos si es primo incrementandolo
			if (primo == true) {
				inicio++;
				System.out.println(i + (" es número primo"));
			}
		}
		//Expresamos la suma de todos los números primos
		System.out.println("Entre 1 y " + num + ", hay " + inicio + " números primos");
	}

}
