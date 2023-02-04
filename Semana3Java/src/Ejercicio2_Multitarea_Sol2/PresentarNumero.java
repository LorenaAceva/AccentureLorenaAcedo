package Ejercicio2_Multitarea_Sol2;

/**
 * Presentamos números
 * 
 * Implementamos la interfaz runnable, lo que nos permitirá crear tareas que
 * puedan ser ejecutadas por varios hilos
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class PresentarNumero implements Runnable {

	Buffer buf;

	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	/**
	 * Llamaremos a este método único de Runnable desde Start(), del objeto Thread
	 * en la clase Main
	 * 
	 * Usaremos Synchronized para evitar que varios hilos
	 * ejecuten a la vez ese mismo código
	 */
	@Override
	public void run() {
		while (true) {
			synchronized (buf) {
				while (!buf.isDisponible()) {
					System.out.println("Esperando número...");
					try {
						buf.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(buf.getNumero());
				buf.setDisponible(false);
				buf.notifyAll();
			}

		}
	}
}
