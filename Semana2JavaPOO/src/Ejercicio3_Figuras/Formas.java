package Ejercicio3_Figuras;

/**
 * Clase padre de las figuras. Implementan al interface dibujo.
 * 
 * @author lorena.acedo.vazquez
 *
 */

public abstract class Formas implements Dibujo {

	private String nombre;

	/**
	 * Añadimos su get y su constructor
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public Formas(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Métodos abstracto, cada clase hija sobreescribirá estos métodos
	 * 
	 * @return
	 */
	public abstract double calcularArea();

}
