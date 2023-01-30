package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ValidatorTest {
	
	final String ALFANUMERICO_OK="3RTGFDEWSD RTGF5";
	final String ALFANUMERICO_NOT= "$%&·&&&";
	
	final String PHONENUMBER_OK="123321123";
	final String PHONENUMBER_NOT="345";
	
	final String EMAIL_OK="lorena.acedo.vazquez@accenture.com";
	final String EMAIL_NOT="holaquetal.com";
	
	final String DNI_OK="34.456.543-R";
	final String DNI_NOT="3445434543";
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

	@Test
	void testCumpleRangoIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMin() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMax() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Disabled
	void testValDateMin() {
		fail("Not yet implemented");
	}

	@Disabled
	void testValDateMax() {
		fail("Not yet implemented");
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
