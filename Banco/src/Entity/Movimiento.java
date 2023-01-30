package Entity;

import java.time.LocalDate;

/**
 * Clase Simple con relación de dependencia con las demás entidades 
 * 
 * Analizará los movimientos de la cuenta
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Movimiento {

	private String mConcepto;
	private LocalDate fecha;
	private double mImporte;

	/**
	 * Constructor por defecto
	 */
	public Movimiento() {
		fecha=LocalDate.now();

	}

	/**
	 * Generamos los getter & setter
	 * 
	 * @return
	 */
	public String getmConcepto() {
		return mConcepto;
	}

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getmImporte() {
		return mImporte;
	}

	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}

	/**
	 * Generamos toString() para transformar a String
	 */
	@Override
	public String toString() {
		return "Movimiento [mConcepto=" + mConcepto + ", fecha=" + fecha + ", mImporte=" + mImporte + "]";
	}

}
