package Entity;

import java.util.ArrayList;
import java.util.List;

import Util.Filtros;

/**
 * Clase principal con relación de dependencia a Movimiento y asociada a Trajeta
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Cuenta {

	private List<Movimiento> mMovimientos;
	private String mNumero;
	private String mTitular;

	final int NUM_MAX = 40;
	final int NUM_MIN = 10;
	final int C_MAX = 100;
	final int C_MIN = 10;

	/**
	 * Constructor Añadimos filtro de longitud para el tamaño del nombre del titular
	 */

	public Cuenta(String mNumero, String mTitular) throws Exception{
		if (Filtros.cumpleLongitud(mTitular, NUM_MAX, NUM_MIN)) {
			this.mNumero = mNumero;
			mTitular = mTitular;
			mMovimientos=new ArrayList<Movimiento>();
		} else {
			throw new Exception("El tamaño del nombre no es el correcto");
		}
	}

	/**
	 * Introducimos getter & setter
	 * 
	 * @return
	 */


	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	/**
	 * Método que acumulará los movimientos junto a su descripción, Usamos
	 * polimorfismo
	 * 
	 * @param concepto
	 * @param importe
	 */
	public void addMovimiento(String concepto, double importe) {
		Movimiento m = new Movimiento();
		m.setmConcepto(concepto);
		m.setmImporte(importe);
		addMovimiento(m);

	}

	public void addMovimiento(Movimiento m) {
		mMovimientos.add(m);

	}

	/**
	 * Método que utilizaremos para ingresar, usamos polimorfismo
	 * 
	 * @param x
	 * @throws Exception
	 */
	public void ingresar(double importe) throws Exception {
		ingresar("Ingresar en efectivo", importe);

	}

	/**
	 * Método para ingresar con filtro para validar la longitud del concepto
	 * @param concepto
	 * @param x
	 * @throws Exception
	 */
	public void ingresar(String concepto, double importe) throws Exception {
		if (importe <= 0)
			throw new Exception("Importe, siempre positivo");
		if (Filtros.cumpleLongitud(concepto, C_MAX, C_MIN))
		addMovimiento(concepto, importe);
		else {
			throw new Exception("El tamaño del concepto no es el correcto");
		}

	}

	/**
	 * Método para retirar dinero usando polimorfismo
	 * 
	 * @param x
	 * @throws Exception
	 */
	public void retirar(double importe) throws Exception {
		retirar("Retirada de efectivo", importe);
	}

	public void retirar(String concepto, double importe) throws Exception {
		if (importe <= 0) {
			throw new Exception("ERROR, No se puede retirar con saldo negativo");
		}
		if (getSaldo() < importe) {
			throw new Exception("Saldo insuficiente");
		}
		if (Filtros.cumpleLongitud(concepto, C_MAX, C_MIN)) {
			addMovimiento(concepto, -importe);
		} else {
			throw new Exception("ERROR, El tamaño del concepto no es el correcto");
		}
	}

	/**
	 * Método que nos ayudará a saber el saldo actualizado llamando al getmImporte
	 * 
	 * @return
	 */
	public double getSaldo() {
		double r = 0.0;
		for (Movimiento m : mMovimientos) {
			r += m.getmImporte();
		}
		return r;
	}

	/**
	 * Se listarán los movimientos de la cuenta
	 */
	public void verMovimientos() {
		System.out.println("----------------------Listado Movimientos cuenta--------------------------");
		System.out.println(mMovimientos.size());
		for (Movimiento m : mMovimientos) {
			System.out.println(m);
		}
	}
}
