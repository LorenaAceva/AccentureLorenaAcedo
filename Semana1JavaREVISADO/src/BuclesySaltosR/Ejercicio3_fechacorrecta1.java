package BuclesySaltosR;

/**
 * Verificamos fecha Consideramos que los meses tienen 30 días
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Ejercicio3_fechacorrecta1 {

	public static void main(String[] args) {

		int dia = 20;
		int mes = 8;
		int año = 2015;

		if (dia >= 1 && dia <= 30) {
			if (mes >= 1 && mes <= 12){
				if (año != 0) {
					System.out.println("Fecha Correcta");
				
				}else
					System.out.println("Año Incorrecto");
			
			}else {
				System.out.println("Mes Incorrecto");
			
			
			else {
			System.out.println("Día Incorrecto");
		}
	}

	}

}
