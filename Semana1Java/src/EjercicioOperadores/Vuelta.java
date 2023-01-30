package EjercicioOperadores;

public class Vuelta {

	public static void main(String[] args) {

		String salida = "";
		for (String ele : args) {
			salida = salida + ele + " ";
		}

		System.out.println("Fase 1 *******");
		System.out.println(salida);
		System.out.println("la frase al revés 1: " + salida);

		String[] palabras = salida.split(" ");
		int fin = palabras.length;
		String salida2 = "";
		for (int i = fin - 1; i >= 0; i--) {// Empezamos por el último elemento de la Array (i=fin-1)
			salida2 = salida2 + palabras[i] + " ";

		}
		System.out.println("Fase 2 *******");
		System.out.println(salida2);
		System.out.println("la frase al revés 2: " + salida2);

		System.out.println("Fase 3 *******");
		String salida3 = "";
		int ls = salida.length();
		for (int i = ls - 1; i >= 0; i--) {
			salida3 += salida.charAt(i);
		}
		System.out.println(salida2);
		System.out.println("la frase al revés 3: " + salida3);

		//

		String salida4 = "";
		int ls2 = salida.length();
		for (int i = ls2 - 1; i >= 0; i--) {
			char nose = salida.charAt(i);
			switch (nose) {
			case 'a':
				nose = '4';
				break;
			case 'e':
			case 'E':
				nose = '3';
				break;
			case 'i':
				nose = 0;
				break;
			case 'u':
				nose = 9;
				break;

			}
			return;
		}

		for (int i = ls2 - 1; i >= 0; i--) {
			char nose = salida.charAt(i);
			nose = conver(nose);
			salida4 += nose;
		}
		System.out.println("Fase 4 *******");
		System.out.println("La frase al revés 4: " + salida4);

		System.out.println("Fase 5 **********");
		char bus = salida.charAt(0);
		String salida5 = "";
		for (int a = 1; (salida + bus).charAt(a) != bus; a++) {
			System.out.println(salida.charAt(a));
			salida5 = salida.charAt(a) + salida5;

		}
		System.out.println();
		System.out.println(salida5);

		System.out.println("Fase 6*******");
		salida += (char) 0;
		int pos = 0;
		salida = "";
		while (entrada.charAt(pos) != (char) 0)
			salida = entrada.charAt(pos++) + salida;
	}

}
