package Ejercicio2_Agroalimentaria;

public class Refrigerados extends Productos {

	private int codOSA;

	/**
	 * Introducimos constructor con todos los parámetros
	 * 
	 * @param fechaCaducidad
	 * @param numLote
	 * @param codOSA
	 */

	public Refrigerados(String fechaCaducidad, int numLote, int codOSA) {
		super(fechaCaducidad, numLote);
		this.codOSA = codOSA;
	}

	/**
	 * Generamos getter & setter
	 * 
	 * @return
	 */
	
	public int getCodOSA() {
		return codOSA;
	}

	public void setCodOSA(int codOSA) {
		this.codOSA = codOSA;
	}

}
