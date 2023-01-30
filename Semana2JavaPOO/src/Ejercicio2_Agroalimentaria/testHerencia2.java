package Ejercicio2_Agroalimentaria;

/**
 * Clase principal, se construyen los objetos ejemplos e imprimimos por pantalla
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class testHerencia2 {

	public static void main(String[] args) {

		Congelados salmon = new Congelados("21-01-2023", 34567, 34.3, 23, 65, 43, 1000.0, 2.3, 34);
		Frescos tomate = new Frescos("31-01-2023", 78562, "2-01-2023", "España");
		Refrigerados yogures = new Refrigerados("25-01-2023", 39062, 234);

		System.out.println("Lomos de Salmón");
		System.out.println("Fecha de caducidad: " + salmon.getFechaCaducidad() + "Nº Lote: " + salmon.getNumLote()
				+ "%Nitrogeno: " + salmon.getpNitrogeno() + "%Oxigeno:" + salmon.getpH2O() + "%Agua: "
				+ salmon.getpH2O() + "%CO2: " + salmon.getpCO2());

	}

}
