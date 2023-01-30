package EjercicioDatos;

public class Datos2 {

	/**
	 * Declararemos los atributos como static para que sean visibles, ya que el
	 * método con el que trabajamos también lo es
	 * 
	 * @param args
	 */

	static int dia = 10;
	static long nDni = 57443222;
	static double precio;
	static final boolean ACTIVO = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		precio = 135.12;

		System.out.println("Dia\t" + dia);
		System.out.println("Dni\t" + nDni);
		System.out.println("Precio\t" + precio);
		System.out.println("Activo\t" + ACTIVO);

	}

}
