package Util;

import Model.Country;

public class MontadorSQL {
	public String montaSql(Country country) {
		String salida = "";
		salida = addSalida(salida, "country_id", country.getCountry_id(), ",");
		salida = addSalida(salida, "country_name", country.getCountry_name(), ",");
		salida = addSalida(salida, "region_id", country.getRegion_id(), ",");
		return salida;

	}

	/**
	 * Completa SQL Añadiendo el nombre del campo y su valor (Si se pasa) Pensado
	 * para INSERT Y UPDATE
	 * 
	 * @param salida      --> Parte de la String ya construida
	 * @param nombreCampo -->Nombre del campo que se va a añadir
	 * @param valor       -->Valor del campo
	 * @param separador   -->Separador que se tiene que añadir entre campos
	 * @return --> Strin que recibimos parcialmente construida a la que le hemos
	 *         añadido el nuevo campo
	 */
	public static String addSalida(String salida, String nombreCampo, int valor, String separador) {// "'" + valor + "'" (Forma rápida de convertir a String)
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);

	}

	public static String addSalida(String salida, String nombreCampo, double valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);

	}

	public static String addSalida(String salida, String nombreCampo, long valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);

	}

	public static String addSalida(String salida, String nombreCampo, String valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);

	}

	/**
	 * Recibe una String parcialmente construida y que tiene que completar, 
	 * El nombre del campo se añade solo si no es nulo 
	 * A continuación, del campo se añade un signo "=" solo si se ha añadido nombre del campo 
	 * Se añade el valor recibido
	 * 
	 * @param salida
	 * @param nombreCampo
	 * @param Valor
	 * @param separador
	 * @return
	 */
	public static String addSalidaSencilla(String salida, String nombreCampo, String valor, String separador) {
		if (salida.length() > 0)
			salida += "" + separador + "";
		if (nombreCampo != null && nombreCampo.compareTo("") > 0)
			salida += nombreCampo + "=";
		salida += valor;

		return salida;

	}

}
