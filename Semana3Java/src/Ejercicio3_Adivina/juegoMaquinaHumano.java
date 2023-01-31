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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		boolean Humano = true;

		/**
		 * Ejecutamos el bucle hasta que se llegue al acierto con ambos métodos
		 */
		while (true) {
			if (!Humano) {
				int nInicio = 0;
				int nFin = 1000;
				TurnoMaquina(input, random, nInicio, nFin);
				Humano = true;
			} else {
				TurnoHumano(input, random);
				Humano = false;
			}
		}
	}

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
			System.out.print("¿El número es mayor o menor? (M = mayor, m = menor, C = correcto): ");
			String response = input.next();
			/**
			 * Se compara el número de la máquina con el que pensamos y orientamos con
			 * mayor, menor o correcto
			 */
			if (response.equalsIgnoreCase("M")) {
				nInicio = nAdivinar + 1;
			} else if (response.equalsIgnoreCase("m")) {
				nFin = nAdivinar - 1;
			} else if (response.equalsIgnoreCase("C")) {
				System.out.println("La máquina acertó!");
				break;
			} else {
				System.out.println("Respuesta errónea, intente de nuevo.");
			}
		}
	}

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
