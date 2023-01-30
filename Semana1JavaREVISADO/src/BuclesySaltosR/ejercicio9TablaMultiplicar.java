package BuclesySaltosR;

/**
 * Imprimimos por pantalla las tablas de multiplicar del 1 al 10
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio9TablaMultiplicar {

	public static void main(String[] args) {
		
		int tabla, i;
		//Bucle for para las tablas del 1 al 10
		for (tabla = 1; tabla <= 10; tabla++) {
			
			System.out.println(".................");
			System.out.println("\nTabla del " + tabla);
			
			//Bucle for para cada tabla del 1 al 10
			for (i = 1; i <= 10; i++) {
				System.out.println(tabla + "x" + i + "=" + tabla * i);
			}
		}

	}

}
