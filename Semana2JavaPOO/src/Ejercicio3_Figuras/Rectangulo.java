package Ejercicio3_Figuras;

/**
 * clase que hereda de formas
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Rectangulo extends Formas {

	private double base;
	private double altura;

	
	/**
	 * Añadimos constructor e invocamos el de la superclase
	 * @param nombre
	 * @param base
	 * @param altura
	 */	

	public Rectangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * Sobreescribimos los métodos
	 */

	@Override
	public double calcularArea() {
		return base * altura;
	}
	
	@Override
	public void dibujar() {
		System.out.println(super.getNombre() + ": ▆ ");

	}

}
