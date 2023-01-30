package Ejercicio1;

/**
 * Metodo encargado de pedir datos por teclado 
 */

import java.util.Scanner;

public class PideTeclado {
	private String nombre;
	private String apellido;

	public void pedirDatos() {

		Scanner EntradaDatos = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		nombre = EntradaDatos.nextLine();

		System.out.print("Ingrese su apellido: ");
		apellido = EntradaDatos.nextLine();

		EntradaDatos.close();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

}
