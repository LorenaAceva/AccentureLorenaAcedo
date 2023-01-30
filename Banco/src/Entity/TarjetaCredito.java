package Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que hereda de tarjeta
 * 
 * Analizaremos la funcionalidad de una tarjeta de crédito
 * 
 * @author lorena.acedo.vazquez
 *
 */

/**
 * Al implanta la interfaz Serializable y su serialVersion, nos aseguramos que
 * la clase serializada sea compatible con versiones anteriores de la misma
 * clase
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class TarjetaCredito extends Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	private double mCredito;
	private List<Movimiento> mMovimientos;

	private LocalDate fechaMov = LocalDate.now();

	// Constantes para el cobro de comisiones
	public static final double COMISION = 0.05;
	public static final double MIN_COMISION = 3.0;

	/**
	 * Introducimos constructor
	 * 
	 * @param mCuentaAsociada
	 * @param mFechaDeCaducidad
	 * @param mNumero
	 * @param mTitular
	 * @param mCredito
	 * @param mMovimientos
	 */

	public TarjetaCredito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular,double mCredito) {
		super(mFechaDeCaducidad, mNumero, mTitular);
		this.mCredito = mCredito;
		mMovimientos=new ArrayList<Movimiento>();
	}


	/**
	 * Introducimos getter & setter
	 * 
	 * @return
	 */
	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	/**
	 * Método para reflejar el saldo cuando se solicita, No se guarda el movimiento
	 * pero si se consultan y actualizan
	 */
	@Override
	public double getSaldo() {
		double r = 0.0;
		for (Movimiento m : mMovimientos) {
			r += m.getmImporte();
		}
		return r + getmCredito();
	}

	/**
	 * Método para ingresar en cuenta asociada Añadimos a movimiento
	 */
	@Override
	public void ingresar(double x) throws Exception {
		Movimiento m = new Movimiento();
		m.setFecha(m.getFecha());
		m.setmConcepto("Ingreso en cuenta asociada");
		m.setmImporte(x);
		mMovimientos.add(m);

	}

	/**
	 * Método para realizar pagos en establecimientos Anotaciones de fecha,
	 * concepto, importe. Añadimos la acción a movimientos
	 */
	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		Movimiento m = new Movimiento();
		m.setFecha(m.getFecha());
		m.setmConcepto("Compra a credito en: " + datos);
		m.setmImporte(x);
		mMovimientos.add(m);

	}

	/**
	 * Método para retirar fondos desde la tarjeta Fecha, concepto, importe, cobro
	 * de comisiones,y añadimos a movimiento Comisión 5% Minimo comisión 3 €
	 * Lanzamos la excepción, si el saldo fuese inferior a 0
	 * 
	 */

	@Override
	public void retirar(double x) throws Exception {
		if (x > 0) {
			x = x + (x * COMISION < MIN_COMISION ? MIN_COMISION : x * COMISION);
		}			
		if (x > getCreditoDisponible()) {
			throw new Exception("Credito Insuficiente");
		}
		Movimiento m = new Movimiento();
		m.setFecha(m.getFecha());
		m.setmConcepto("Retirada en cajero automático");
		m.setmImporte(-x);
		mMovimientos.add(m);

	}

	/**
	 * Método para liquidar que recibe mes y año
	 * 
	 * Añadimos concepto
	 * 
	 * @param mes
	 * @param año
	 */
	public void liquidar(int mes, int año) {
		Movimiento liq = new Movimiento();

		liq.setmConcepto("Liquidación de operaciones tarjeta crédito, " + mes + " de " + año);
		double r = 0.0;

		// Realizamos un iterator para comprobar que el movimiento tiene los mismos
		// datos y devolverlos
		for (Iterator it = mMovimientos.iterator(); it.hasNext();) {
			Movimiento m = (Movimiento) it.next();
			if (m.getFecha().getMonthValue() == mes && m.getFecha().getYear() == año) {
				r += m.getmImporte();
				it.remove();
			}

		}
		liq.setmImporte(r);
		if (r != 0)
			getmCuentaAsociada().addMovimiento(liq);
	}

	public double getCreditoDisponible() {
		return mCredito + getSaldo();

	}

	public void verMovimientos() {
		System.out.println("----------------------Listado Movimientos Tarjeta Crédito--------------------------");
		System.out.println(mMovimientos.size());
		for (Movimiento m : mMovimientos) {
			System.out.println(m);
		}

	}
}
