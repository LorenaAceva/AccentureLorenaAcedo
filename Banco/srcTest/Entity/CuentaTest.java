package Entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	final String NUM_CUENTA_OK= "2345678909843324";
	
	final String TITULAR_OK="Lorena Acedo ";
	final String TITULAR_NOT= "34FG";
	
	final String CONCEPTO_OK="Pago de factura de la luz";
	final String CONCEPTO_NOT="casa";
	
	final double INGRESAR_OK=200.0;
	final double INGRESAR_NOT= -20;
	
	final double RETIRAR_OK=1000;
	final double RETIRAR_NOT= 1500;
	
	
	Cuenta cuenta;
	
	@BeforeEach
	void creacion() {
		cuenta = new Cuenta(NUM_CUENTA_OK, TITULAR_OK);
	}
	

	@Test
	void testCuentaListOfMovimientoStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testCuentaStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimientoStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimientoMovimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirarStringDouble() {
		Throwable exception = assertThrows(Exception.class, () -> {
			   throw new Exception("a message");
			  });
			  assertEquals("a message", exception.getMessage());
			 }
	

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

}
