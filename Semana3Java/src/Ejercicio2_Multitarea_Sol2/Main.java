package Ejercicio2_Multitarea_Sol2;

/**
 * Presenta en sincronización el generar números con presentarlos
 * @author lorena.acedo.vazquez
 *
 */

public class Main {
	
	static Buffer buf;

	public static void main(String[] args) {
		
		buf=new Buffer();
		buf.setDisponible(false);
		
		GeneraNumero gn=new GeneraNumero();
		gn.setBuf(buf);
		PresentarNumero pn=new PresentarNumero();
		pn.setBuf(buf);
		
		/**
		 * Ejecutaremos los métodos al mismo tiempo con el objeto Thread
		 */
		Thread tgn=new Thread(gn);
		Thread tpn=new Thread(pn);
		
		/**
		 * Iniciamos la ejecución con start()
		 */
		tgn.start();
		tpn.start();

	}

}
