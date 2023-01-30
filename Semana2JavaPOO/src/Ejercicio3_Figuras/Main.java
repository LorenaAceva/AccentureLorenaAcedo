package Ejercicio3_Figuras;

/**
 * Clase principal desde donde hacemos las llamadas a los métodos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Main {

	public static void main(String[] args) {

		// Creo algunos objetos con sus parámetros
		
		Rectangulo rectangulo = new Rectangulo("Dibujando Rectángulo", 5, 6);
		Triangulo triangulo = new Triangulo("Dibujando Triangulo", 8, 9);
		Circulo circulo = new Circulo("Dibujando Circulo", 10);

		/**
		 * Llamamos a los métodos de las clases hijas para calcular el area e imprimimos
		 * por pantalla
		 */
		
		System.out.println("El área del rectangulo es " + rectangulo.calcularArea());
		System.out.println("El área del triángulo es " + triangulo.calcularArea());
		System.out.println("El área del circulo es " + circulo.calcularArea());

		
		/**
		 * Los objetos son implementados por la interfaz Dibujo
		 */
		
		Dibujo[] Formas = { rectangulo, triangulo, circulo };

		/**
		 * Con el bucle conseguiremos dibujar cada figura y ver el polimorfismo dada por
		 * la interfaz
		 */
		
		for (int i = 0; i < Formas.length; i++) {
			Formas[i].dibujar();
		}

	}

}
