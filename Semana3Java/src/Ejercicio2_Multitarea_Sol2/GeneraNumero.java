package Ejercicio2_Multitarea_Sol2;

import java.util.Random;

/**
 * Genera números aleatorios
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class GeneraNumero implements Runnable {

	Buffer buf;

	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	/**
	 * Genera números aleatorios, usaremos Synchronized para evitar que varios hilos
	 * ejecuten a la vez ese mismo código
	 */
	@Override
	public void run() {

		Random rn = new Random();
		while (true) {
			synchronized (buf) {
				while (buf.isDisponible()) {
					System.out.println("Esperando espacio...");
					try {
						buf.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				buf.setNumero(rn.nextInt());
				buf.setDisponible(true);
				System.out.println("Numero Disponible");
				buf.notifyAll();
			}
		}

	}

}
