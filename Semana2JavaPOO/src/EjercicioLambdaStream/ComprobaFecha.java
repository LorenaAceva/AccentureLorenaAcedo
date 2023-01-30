package EjercicioLambdaStream;

import java.time.DateTimeException;
import java.time.LocalDate;

public class ComprobaFecha {
	
	private int year;
	private int day;
	private int month;
	
	
	
	
	public ComprobaFecha(int year, int day, int month) {
		super();
		this.year = year;
		this.day = day;
		this.month = month;
	}


	


	public int getYear() {
		return year;
	}





	public void setYear(int year) {
		this.year = year;
	}





	public int getDay() {
		return day;
	}





	public void setDay(int day) {
		this.day = day;
	}





	public int getMonth() {
		return month;
	}





	public void setMonth(int month) {
		this.month = month;
	}




	/**
	 * Metodo validar con locaDate
	 * @param fecha
	 * @return
	 */

	private boolean fechaCorrecta(int year, int day, int month) {
		boolean fechaCorrecta= true;
		try {
			LocalDate.of(year, month, month);
		}catch (DateTimeException e) {
			fechaCorrecta=false;
		}
		return fechaCorrecta;
	}


	public static void main(String[] args)throws Exception {
		
		LocalDate fecha=LocalDate.now();
		System.out.println(fecha);
		

		fecha.fechaCorrecta();
		
		
	}
}