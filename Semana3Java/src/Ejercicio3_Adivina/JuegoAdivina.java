package Ejercicio3_Adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * Juego para adivinar números aleatorios de 0-100
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class JuegoAdivina {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		/**
		 * Se genera un número de 0 a 100 y se almacena en una variable
		 */
		int numero = random.nextInt(100) + 1;
		int nAdivinar = 0;

		/**
		 * Solicitamos al usuario que empiece el juego introduciendo un número
		 */
		while (nAdivinar != numero) {
			System.out.print("Adivina un número entre 0 y 100: ");
			nAdivinar = input.nextInt();

			/**
			 * Se compara el número ingresado con el numero aleatorio. Se orienta al usuario
			 * de si es mayo, menor o si ha acertado
			 */
			if (nAdivinar < numero) {
				System.out.println("El número es mayor");
			} else if (nAdivinar > numero) {
				System.out.println("El número es menor");
			}
		}

		System.out.println("¡Has Acertado!");
	}

}
