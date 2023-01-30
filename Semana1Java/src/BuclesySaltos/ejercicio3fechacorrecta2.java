package BuclesySaltos;

/**
 * Verificamos la fecha utilizando días reales, sin Array
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class ejercicio3fechacorrecta2 {

	public static void main(String[] args) {

		int dia = 20;
		int mes = 8;
		int año = 2015;
		boolean diaReal = false;

		if (mes >= 1 && mes <= 12)
			if (año != 0) {
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia <= 30)
						diaReal = true;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia <= 30)
						diaReal = true;
					break;
				default:
					if (dia <= 28)
						diaReal = true;

				}
				if (diaReal)
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
