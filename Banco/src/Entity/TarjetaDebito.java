package Entity;
/**
 * Clase que hereda de Tarjeta
 */

import java.time.LocalDate;

public class TarjetaDebito extends Tarjeta {

	/**
	 * Introducimos constructor
	 * 
	 * @param numero
	 * @param titular
	 * @param fechaDeCaducidad
	 */

	public TarjetaDebito(String numero, String titular, LocalDate fechaDeCaducidad) {
		super(numero, titular, fechaDeCaducidad);

	}

	/**
	 * Método clase para conseguir el saldo de la cuenta asociada
	 */
	
	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}


	/**
	 * Método para ingresar el dinero en la cuenta asociada
	 */
	public void ingresar(double importe) throws Exception {
		getmCuentaAsociada().ingresar("Ingreso en cajero Automático", importe);
	}


	/**
	 * Método para pagar en establecimiento y que se registre el concepto en la cuenta asociada al ser llamada
	 */
	public void pagoEnEstablecimiento(String datos, double importe) throws Exception {
		getmCuentaAsociada().retirar("Compra en : " + datos, importe);

	}

	/**
	 * Método para retirar dinero de la cuenta asociada al llamarla
	 */
	public void retirar(double importe) throws Exception {
		getmCuentaAsociada().retirar("Retirada en cajero automatico : ", importe);

	}

}
