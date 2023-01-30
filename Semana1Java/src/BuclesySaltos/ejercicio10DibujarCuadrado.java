package BuclesySaltos;

/**
 * Dibujamos un cuadrado con el tamaño de 8
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio10DibujarCuadrado {

	public static void main(String[] args) {

		int tam = 8;
		int fila;
		int colum;

		for (fila = 1; fila <= tam; fila++) {
			for (colum = 1; colum <= tam; colum++)
				System.out.println("* ");
			System.out.println("");
		}
	}

}
