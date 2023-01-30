package EjercicioOperadoresR;

/**
 * Comprobamos el resultado del siguiente código
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Ejercicio1_operadores {

	public static void main(String[] args) {

		int valor = 0;
		valor = 23;
		valor += 10;

		System.out.println("a=" + --valor);
		System.out.println("b=" + ++valor);
		System.out.println("c=" + valor++);
		System.out.println("d=" + valor--);
		System.out.println("e=" + valor);
	}

}
