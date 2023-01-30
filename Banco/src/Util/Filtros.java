package Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Introducimos filtros en el programa: Nombres del titular con límite de
 * caracteres Fecha de vencimiento Descripción del concepto con limite de
 * caracteres
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Filtros {

	private final static String FORMATO_FECHA = "dd/MM/yyyy";

	/**
	 * Limite Máximo y Mínimo de un String
	 * 
	 * @param texto
	 * @param longitud
	 * @return
	 */

	public static boolean lMax(String texto, int longitud) {
		return texto.length() <= longitud;

	}

	public static boolean lMin(String texto, int longitud) {
		return texto.length() >= longitud;
	}

	/**
	 * Control de longitud de String
	 * 
	 * @param texto
	 * @param maxLongitud
	 * @param minLongitud
	 * @return
	 */
	public static boolean cumpleLongitud(String texto, int maxLongitud, int minLongitud) {
		return lMax(texto, maxLongitud) && lMin(texto, minLongitud);
	}

	/**
	 * Limite de fecha máxima
	 * 
	 * @param fecha
	 * @param fMaxima
	 * @return
	 */
	public static boolean fMax(LocalDate fecha, LocalDate fMaxima) {
		return fecha.isBefore(fMaxima);
	}

	/**
	 * Límite de fecha mínima
	 * 
	 * @param fecha
	 * @param fMinima
	 * @return
	 */
	public static boolean fMin(LocalDate fecha, LocalDate fMinima) {
		return fecha.isAfter(fMinima);
	}

	/**
	 * Límite de fecha máxima y mínima
	 * 
	 * @param fecha
	 * @param maxAny
	 * @param minAny
	 * @return
	 */
	public static boolean filtroFechaAny(LocalDate fecha, int maxAny, int minAny) {
		LocalDate hoy = LocalDate.now();
		LocalDate maxFech = hoy.plusYears(maxAny);
		LocalDate minFech = hoy.plusYears(minAny);
		return fMax(fecha, maxFech) && fMin(fecha, minFech);
	}

	/**
	 * Filtro encargado de verificar que el formato de la escritura de la fecha sea
	 * la correcta
	 */
	public static boolean esFechaValida(String fecha) {
		try {
			LocalDate.parse(fecha);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	/**
	 * 
	 * Usaremos DateTimeFormatter para formatear la fecha en un formato especifico
	 * 
	 * @param fecha
	 * @return
	 */
	public static boolean fechaCorrecta(String fecha) {

		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMATO_FECHA);
			LocalDate.parse(fecha, formatter);

			return true;

		} catch (DateTimeParseException e) {

			return false;
		}

	}

}
