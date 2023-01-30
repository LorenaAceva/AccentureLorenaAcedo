package EjercicioDatosR;

public class Datos1b {

	/**
	 * Opción 2 al ejercicio 1:
	 * Declararemos los atributos como static para que sean
	 * visibles, ya que el método con el que trabajamos también lo es
	 * 
	 * @param args
	 */

	static int dia = 10;
	static long nDni = 57443222;
	static double precio = 135.12;;
	static final boolean ACTIVO = true;

	public static void main(String[] args) {

		System.out.println("Dia\t" + dia);
		System.out.println("Dni\t" + nDni);
		System.out.println("Precio\t" + precio);
		System.out.println("Activo\t" + ACTIVO);

	}

}
