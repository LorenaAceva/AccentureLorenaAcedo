package EjercicioOperadoresR;

/**
 * Cálculo de una linea de factura
 * Importe, Iva y Total
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Ejercicio2_Factura {

	//Constante del IVA fuera del método
	final static int IVA = 21;

	public static void main(String[] args) {

		
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.40;
		
		//Calculamos el importe de los productos
		double importe= cantidad * unidades * precio;;
		
		//Cálculo del IVA
		double iva = importe * IVA / 100;
		
		//Cálculo del Total
		int total= (int) (importe + iva);;
	

		System.out.println("cantidad\t=" + cantidad);
		System.out.println("unidades\t=" + unidades);
		System.out.println("precio\t\t=" + precio);

		System.out.println("Importe\t\t=" + importe);
		System.out.println("Iva\t\t=" + iva);
		System.out.println("Total\t\t= " + total + " debería ser: " + importe + iva);

	}

}
