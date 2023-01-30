package Entity;

import java.time.LocalDate;

/**
 * 
 * @author lorena.acedo.vazquez
 *
 */

public abstract class Tarjeta {

	private Cuenta mCuentaAsociada;
	private LocalDate mFechaDeCaducidad;
	private String mNumero;
	private String mTitular;

	/**
	 * Introducimos Constructor
	 * 
	 * @param mCuentaAsociada
	 * @param mFechaDeCaducidad
	 * @param mNumero
	 * @param mTitular
	 */

	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		this.mFechaDeCaducidad = LocalDate.from(mFechaDeCaducidad);
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}

	/**
	 * Introducimos getter & setter
	 * 
	 * @return
	 */

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}
	public LocalDate getmFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	public void setmFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		this.mFechaDeCaducidad = mFechaDeCaducidad;
	}

	/**
	 * Constructor vacio
	 */
	public Tarjeta() {

	}

	/**
	 * Constructor
	 * 
	 * @param numero
	 * @param titular
	 * @param fechaDeCaducidad
	 */
	public Tarjeta(String numero, String titular, LocalDate fechaDeCaducidad) {
		mNumero = numero;
		mTitular = titular;
		mFechaDeCaducidad = LocalDate.from(fechaDeCaducidad);

	}
	/**
	 * Método que crea la cuenta y la guarda en cuenta asociada
	 * @param c
	 */
	public void setCuenta(Cuenta c) {
		mCuentaAsociada = c;
	}

	/**
	 * Métodos abstractos
	 * 
	 * @return
	 */
	public abstract double getSaldo();

	public abstract void ingresar(double x) throws Exception;

	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;

	public abstract void retirar(double x) throws Exception;

	

}
