package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lee el contenido de un archivo concreto y lo imprime por pantalla
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class LeerArchivo {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Accedemos al archivo creado
		 */
		File file = new File(".\\nombreApellido");
		
		/**
		 * Leemos desde archivo
		 */
		FileReader fr = new FileReader(file);
		
		/**
		 * Lee el archivo pero desde un búfer creado Se usa junto a FileReader para
		 * mejorar el rendimiento
		 */
		BufferedReader br = new BufferedReader(fr);

		String nombre = "";
		String apellido = "";
		String lecturaArchivo = "";
		
		/**
		 * Imprimimos lectura
		 */
		while ((lecturaArchivo = br.readLine()) != null) {
			
			String dato[]=lecturaArchivo.split("=");
			
			if (dato[0].equals("Nombre")) {
				nombre=dato[1];
			}
			if (dato[0].equals("Apellido")) {
				apellido=dato[1];
			}
			
		}
			
		System.out.println(nombre+ " "+ apellido);

	}

}
