package EjercicioOperadores;

public class operadoresFactura {

	final static int IVA = 21;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.40;
		
		double importe;
		int total;

		importe = cantidad * unidades * precio;
		double iva = importe * IVA / 100;
		total = (int) (importe + iva);

		System.out.println("cantidad\t=" + cantidad);
		System.out.println("unidades\t=" + unidades);
		System.out.println("precio\t\t=" + precio);

		System.out.println("Importe\t\t=" + importe);
		System.out.println("Iva\t\t=" + iva);
		System.out.println("Total\t\t= " + total + " debería ser: " + importe + iva);

	}

}
