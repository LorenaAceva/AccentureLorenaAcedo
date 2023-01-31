package Ejercicio3_Adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * Juego de adivinanza de números entre la máquina y el usuario y viceversa
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class juegoMaquinaHumano {
	
	
	static int nInicio = 0;
	static int nFin = 1000;
	static boolean Humano = true;
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		/**
		 * Ejecutamos el bucle hasta que se llegue al acierto con ambos métodos
		 */
		while (true) {
			if (!Humano) {				
				TurnoMaquina(input, random, nInicio, nFin);				
				Humano = true;
			} else {
				TurnoHumano(input, random);
				Humano = false;
			}
		}
				
	}
	/**
	 * Método para el turno de la maquina
	 * @param input
	 * @param random
	 * @param nInicio
	 * @param nFin
	 */

	public static void TurnoMaquina(Scanner input, Random random, int nInicio, int nFin) {
		System.out.println("Turno máquina");
		System.out.println("Piensa en un número de 0 a 1000");

		while (true) {
			int nAdivinar = 0;
			/**
			 * Solicitamos que la máquina diga algún numero
			 */
			nAdivinar = random.nextInt(nFin - nInicio + 1) + nInicio;
			System.out.println("La máquina eligió: " + nAdivinar);
			System.out.print("¿El número es mayor o menor? (1 = mayor, 2 = menor, 3 = correcto): ");
			String respuesta = input.next();
			/**
			 * Se compara el número de la máquina con el que pensamos y orientamos con
			 * mayor, menor o correcto
			 */
			if (respuesta.equalsIgnoreCase("1")) {
				nInicio = nAdivinar + 1;
			} else if (respuesta.equalsIgnoreCase("2")) {
				nFin = nAdivinar - 1;
			} else if (respuesta.equalsIgnoreCase("3")) {
				System.out.println("La máquina acertó!");
				break;
			} else {
				System.out.println("Respuesta errónea, intente de nuevo.");
			}
		}
	}

	/**
	 * Método para el turno del humano
	 * @param input
	 * @param random
	 */
	public static void TurnoHumano(Scanner input, Random random) {
		System.out.println("Turno del humano");
		int numero = random.nextInt(1000) + 1;
		int nAdivinar = 0;

		/**
		 * Solicitamos al usuario que empiece el juego introduciendo un número
		 */
		while (nAdivinar != numero) {
			System.out.print("Adivina un número entre 0 y 1000: ");
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
