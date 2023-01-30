package Ejercicio0_PruebaColecciones;
/**
 * Intercambio de datos entre dos objetos
 * @author lorena.acedo.vazquez
 *
 */

public class Intercambio {
	
	private T a;
	private T b;

/**
 * Creamos constructor de los parámetros
 * @param a
 * @param b
 */
	public Intercambio(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

public T getA() {
	return a;
}

public void setA(T a) {
	this.a = a;
}

public T getB() {
	return b;
}

public void setB(T b) {
	this.b = b;
}

	public void intercambio() {
		T temp= a;
		a=b;
		b=temp;
		
	}

}
