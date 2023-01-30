package Ejercicio2_Agroalimentaria;

/**
 * Clase que hereda de productos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Frescos extends Productos {
	private String fechEnv;
	private String paisOrigen;

	/**
	 * Introducimos Constructores con todos sus parámetros
	 * @param fechaCaducidad
	 * @param numLote
	 * @param fechEnv
	 * @param paisOrigen
	 */

	public Frescos(String fechaCaducidad, int numLote, String fechEnv, String paisOrigen) {
		super(fechaCaducidad, numLote);
		this.fechEnv = fechEnv;
		this.paisOrigen = paisOrigen;
	}

	/**
	 * Introducimos getter & setter
	 * 
	 * @return
	 */
	public String getFechEnv() {
		return fechEnv;
	}

	
	public void setFechEnv(String fechEnv) {
		this.fechEnv = fechEnv;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

}
