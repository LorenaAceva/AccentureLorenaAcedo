package Ejercicio4_Baraja;

/**
 * Clase con las caracteristicas de los valores y palos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Carta {

	private int valor;
	private String palo;
	
	public static final String[] PALOS_POKER= {"Corazones", "Picas", "Trebol", "Diamantes"};
	public static final int NUMERO_CARTAS=12;

	/**
	 * Creamos constructor
	 * 
	 * @param valor
	 * @param palo
	 */

	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	/**
	 * Introducimos getter
	 * 
	 * @return
	 */
	public int getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	/**
	 * Introducimos el método to String 
	 * Este método ayudará a imprimir en cadena de
	 * String el valor y el palo de cada carta
	 */
	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}

}
