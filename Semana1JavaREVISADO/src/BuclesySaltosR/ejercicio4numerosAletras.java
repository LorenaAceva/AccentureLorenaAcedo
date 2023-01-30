package BuclesySaltosR;

public class ejercicio4numerosAletras {

	public static void main(String[] args) {
		int num = 72;
		int unidades, decenas;

		String[] parte1 = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		String[] parte2 = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
				"noventa" };

		unidades = num % 10;
		decenas = num / 10;

		if (num > 0) {
			if (num < 16) {
				System.out.println(parte1[num - 1]);
			} else {
				System.out.println(parte2[decenas - 1] + " y " + parte1[unidades]);
			}
		}

	}

}
