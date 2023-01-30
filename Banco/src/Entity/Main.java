package Entity;

import java.time.LocalDate;

public class Main {
	
	static Cuenta c;
	static TarjetaDebito tDebito;
	static TarjetaCredito tCredito;
	

	public static void main(String[] args)throws Exception {
		LocalDate hoy=LocalDate.now();
		LocalDate fecha=LocalDate.now();
		
		c = new Cuenta("234556789034345", "Lorena Acedo Vazquez");
		tDebito=new TarjetaDebito("23456544564333", "Antonio Acedo", fecha);
		tCredito=new TarjetaCredito(fecha,"Carmen Vazquez","34564545454321", 5.9);
		
		c.ingresar(500.00);
		c.ingresar("sueldo de este mes", 2000.00);
		c.retirar(100);
		c.retirar("compra de pienso para casa ", 80.00);
		
		
		tDebito.setCuenta(c);
		tDebito.ingresar(300);
		tDebito.retirar(50);
		
		
		tCredito.setCuenta(c);
		tCredito.ingresar(400);
		tCredito.retirar(130);
		System.out.println(tCredito.getSaldo());
		
		System.out.println("----------------- Movimientos tarjeta de crédito ----------------");
		tCredito.verMovimientos();
		
		tCredito.liquidar(hoy.getMonthValue(),hoy.getYear());
		
		
		
		System.out.println("-----------------Movimientos----------------");
		c.verMovimientos();
		

	}

}
