package BuclesySaltos;

/**
 * Verificamos fecha teniendo en cuenta los años bisiestos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio3fechacorrecta4 {

	public static void main(String[] args) {

		int dia = 20;
		int mes = 8;
		int año = 2004;
		int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

		boolean diaReal = false;

		if (mes >= 1 && mes <= 12)
			if (año != 0) {
				if (((año % 4 == 0 && año % 100 != 0)) | año % 400 == 0)
					diaMes[1] = 29;
				if (dia < 0 && dia <= diaMes[mes - 1])
					System.out.println("Fecha Correcta");
				else
					System.out.println("Día Incorrecto");

			}

			else
				System.out.println("Año Incorrecto");
		else
			System.out.println("Mes Incorrecto");

	}

}
