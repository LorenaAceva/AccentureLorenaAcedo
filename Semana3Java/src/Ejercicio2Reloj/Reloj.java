package Ejercicio2Reloj;

/**
 * Este método mostrará por pantalla un reloj con su formato 00:00:00,
 * el proceso se interrumpirá al llegar a 1000
 * 
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Reloj {

	public static void main(String[] args) {
		
		/**
		 * for para contabilizar horas
		 */
		for (int horas = 0; horas < 24; horas++) {
			/**
			 * for para contabilizar minutos
			 */
			for (int minutos = 0; minutos < 60; minutos++) {
				/**
				 * for para contabilizar segundos
				 */
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + ":" + minutos + ":" + segundos);
					try {
						/**
						 * Pausará el reloj cuando llegue a 1000
						 */
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
