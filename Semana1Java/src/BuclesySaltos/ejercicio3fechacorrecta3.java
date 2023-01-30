package BuclesySaltos;

/**
 * Verificamos fecha usando array
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio3fechacorrecta3 {

	public static void main(String[] args) {

		int dia = 20;
		int mes = 8;
		int año = 2015;
		int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

		boolean diaReal = false;

		if (mes >= 1 && dia <= 30)
			if (mes >= 1 && mes <= 12)
				if (año != 0)
					System.out.println("Fecha Correcta");
				else
					System.out.println("Día Incorrecto");
			else
				System.out.println("Año Incorrecto");
		else
			System.out.println("Mes Incorrecto");

	}

}
