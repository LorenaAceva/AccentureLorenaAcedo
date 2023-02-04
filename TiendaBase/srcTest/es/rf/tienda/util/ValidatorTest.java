package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ValidatorTest {
	
	final String ALFANUMERICO_OK="abc456";
	final String ALFANUMERICO_NOT= "$%&·&&&";
	
	final String PHONENUMBER_OK="1233211230";
	final String PHONENUMBER_NOT="345";
	
	final String EMAIL_OK="lorena.acedo.vazquez@accenture.com";
	final String EMAIL_NOT="holaquetal.com";
	
	final String DNI_OK="28.825.401-F";
	final String DNI_NOT="34.454.34543";
	final String DNI_NOT_CORTO="345";
	
	final String FECHA_OK="09/01/2023";
	final String FECHA_NOT="234432";
	
	final String PASSWORD_OK="3E456&54*^$5a";
	final String PASSWORD_NOT="12345";
	
	
    
    
	
	

	@Test
	void testIsAlfanumeric() {
		assertTrue(Validator.isAlfanumeric(ALFANUMERICO_OK));
		assertFalse(Validator.isAlfanumeric(ALFANUMERICO_NOT));
	}

	@Test
	void testCumplePhoneNumber() {
		assertTrue(Validator.cumplePhoneNumber(PHONENUMBER_OK));
		assertFalse(Validator.cumplePhoneNumber(PHONENUMBER_NOT));
	}

	@Test
	void testIsEmailValido() {
		assertTrue(Validator.isEmailValido(EMAIL_OK));
		assertFalse(Validator.isEmailValido(EMAIL_NOT));
	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(DNI_OK));
		assertFalse(Validator.cumpleDNI(DNI_NOT));
		assertFalse(Validator.cumpleDNI(DNI_NOT_CORTO));
	}

	@Disabled
	void testCumpleRangoIntIntInt() {
		fail("Not yet implemented");
	}

	@Disabled
	void testCumpleRangoDoubleIntInt() {
		fail("Not yet implemented");
	}

	@Disabled
	void testCumpleLongitudMin() {
		fail("Not yet implemented");
	}

	@Disabled
	void testCumpleLongitudMax() {
		fail("Not yet implemented");
	}

	@Disabled
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMin() {
		LocalDate fechaMin_ok = LocalDate.of(2022, 12, 31);
	    LocalDate min_ok = LocalDate.of(2022, 01, 01);
	    LocalDate fechaMin_Not = LocalDate.of(2021, 12, 31);
	    LocalDate min_Not = LocalDate.of(2022, 01, 01);
	    
		assertTrue(Validator.valDateMin(fechaMin_ok, min_ok));
		assertFalse(Validator.valDateMin(fechaMin_Not, min_Not));
	}

	@Test
	void testValDateMax() {	
		LocalDate fechaMax_ok = LocalDate.of(2022, 12, 31);
	    LocalDate max_ok = LocalDate.of(2023, 01, 01);
		LocalDate fechaMax_Not = LocalDate.of(2023, 01, 02);
	    LocalDate max_Not = LocalDate.of(2023, 01, 01);
	    
		assertTrue(Validator.valDateMax(fechaMax_ok,max_ok));
		assertFalse(Validator.valDateMax(fechaMax_Not,max_Not));
		
	}

	@Test
	void testEsFechaValida() {
		assertTrue(Validator.esFechaValida(FECHA_OK));
		assertFalse(Validator.esFechaValida(FECHA_NOT));
	}

	@Test
	void testEsPasswordValida() {
		assertTrue(Validator.esPasswordValida(PASSWORD_OK));
		assertFalse(Validator.esPasswordValida(PASSWORD_NOT));
	}

}
