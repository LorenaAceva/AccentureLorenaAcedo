package areaCirculo;

/**
 * Area y longitud de un círculo
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class areaylongitud {

	public static void main(String[] args) {
		
		double r = 23;// radio
		double a, l;// area

		a = Math.PI * (r * r);
		l = 2 * Math.PI * r;

		System.out.println("El área de un círculo de es " + r + " es: " + a);
		System.out.println("La longitud de un círculo es de " + r + " es: " + l);
	}

}
