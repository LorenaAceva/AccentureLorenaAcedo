package Ejercicio2_Agroalimentaria;

/**
 * Clase que hereda de la clase padre sus atributos e implementa a aire, agua y nitrógeno
 * 
 * @author lorena.acedo.vazquez
 *
 */

public abstract class Congelados extends Productos implements C_Agua, C_Aire, C_Nitrogeno{
	private double pNitrogeno;
	private double pOxigeno;
	private double pH2O;
	private double pCO2;
	private double salinidad;
	private double MetodoCongelacion;
	private double TiempoCongelacion;
	
	/**
	 * Creamos constructor con sus parámetros
	 * @param fechaCaducidad
	 * @param numLote
	 * @param pNitrogeno
	 * @param pOxigeno
	 * @param pH2O
	 * @param pCO2
	 * @param salinidad
	 * @param metodoCongelacion
	 * @param tiempoCongelacion
	 */
	public Congelados(String fechaCaducidad, int numLote, double pNitrogeno, double pOxigeno, double pH2O, double pCO2,
			double salinidad, double metodoCongelacion, double tiempoCongelacion) {
		super(fechaCaducidad, numLote);
		this.pNitrogeno = pNitrogeno;
		this.pOxigeno = pOxigeno;
		this.pH2O = pH2O;
		this.pCO2 = pCO2;
		this.salinidad = salinidad;
		MetodoCongelacion = metodoCongelacion;
		TiempoCongelacion = tiempoCongelacion;
	}

	public double getpNitrogeno() {
		return pNitrogeno;
	}

	public void setpNitrogeno(double pNitrogeno) {
		this.pNitrogeno = pNitrogeno;
	}

	public double getpOxigeno() {
		return pOxigeno;
	}

	public void setpOxigeno(double pOxigeno) {
		this.pOxigeno = pOxigeno;
	}

	public double getpH2O() {
		return pH2O;
	}

	public void setpH2O(double pH2O) {
		this.pH2O = pH2O;
	}

	public double getpCO2() {
		return pCO2;
	}

	public void setpCO2(double pCO2) {
		this.pCO2 = pCO2;
	}

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}

	public double getMetodoCongelacion() {
		return MetodoCongelacion;
	}

	public void setMetodoCongelacion(double metodoCongelacion) {
		MetodoCongelacion = metodoCongelacion;
	}

	public double getTiempoCongelacion() {
		return TiempoCongelacion;
	}

	public void setTiempoCongelacion(double tiempoCongelacion) {
		TiempoCongelacion = tiempoCongelacion;
	}

	
	
	
	

	

	

	 

}
