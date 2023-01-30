package Ejercicio2_Agroalimentaria;

/**
 * Clase padre con datos comunes a las demás clases
 * 
 * @author lorena.acedo.vazquez
 *
 */

public abstract class Productos {

	private String fechaCaducidad;
	private int numLote;

	/**
	 * Añadimos constructor con parametros
	 * 
	 * @param fechaCaducidad
	 * @param numLote
	 */

	public Productos(String fechaCaducidad, int numLote) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}

	/**
	 * Generamos los getter que nos devolverá la fecha de caducidad
	 * 
	 * @return
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

}
