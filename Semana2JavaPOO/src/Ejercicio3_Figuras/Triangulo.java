package Ejercicio3_Figuras;

/**
 * Clase heredada de la clase padre
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Triangulo extends Formas {

	private double base;
	private double altura;

	/**
	 * Añadimos constructor e invocamos el de la superclase
	 * 
	 * @param nombre
	 * @param base
	 * @param altura
	 */
	public Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura / 2;

	}

	@Override
	public void dibujar() {
		System.out.println(super.getNombre() + ": ▲ ");

	}

}
