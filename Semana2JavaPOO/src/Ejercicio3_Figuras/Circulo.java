package Ejercicio3_Figuras;

/**
 * Clase que hereda la clase padre
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Circulo extends Formas {

	private double radio;

	/**
	 * Añadimos constructor e invocamos el de la superclase
	 * 
	 * @param nombre
	 * @param radio
	 */

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public void dibujar() {
		System.out.println(super.getNombre() + ": ●");

	}

}
