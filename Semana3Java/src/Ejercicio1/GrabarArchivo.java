package Ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Crear archivo y grabar contenidos en el
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class GrabarArchivo {
	public static void main(String[] args) throws IOException {
		/**
		 * Creamos archivo con File
		 */
		FileWriter file = new FileWriter(".\\nombreApellido");

		String nombre;
		String apellido;

		/**
		 * Introducimos datos
		 */
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce el nombre");
			nombre = entrada.nextLine();
			System.out.println("introduce el apellido");
			apellido = entrada.nextLine();
		}
		/**
		 * Escribimos en el archivo el contenido introducido por scanner
		 */
		PrintWriter bw = new PrintWriter(file);
		bw.println("Nombre= " + nombre);
		bw.println("Apellido= " + apellido);
		bw.close();
	}
}
