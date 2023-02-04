package Ejercicio2_Multitarea_Sol2;
/**
 * Esta clase será destinada a guardar datos
 * @author lorena.acedo.vazquez
 *
 */

public class Buffer {
	
	private boolean disponible;
	private int numero;
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}

	public int getNumero() {
		while (!this.isDisponible()) {
			System.out.println("");
		}
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
