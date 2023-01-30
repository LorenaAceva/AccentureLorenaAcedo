package EjercicioLambdaStream;

/**
 * Ejercicio para imprimir números pares con stream
 */

import java.util.Arrays;

public class NumPares {

	public static void main(String[] args) {
		int[] SPares= new int[] {0,1,2,3,4,5,6,7,8,9};
		
		/* Método sin Stream
		 
		 int[] SPares2= new int [SPares.length];
		 
		 int x=0;
		 for(int i=0;i<SPares.length;i++){
		 	if (SPares[i]%2==0 {
		 		SPares2[x++]==SPares[i];
		 	}
		 }
		 
		 */
		int[] SPares2=Arrays.stream(SPares).filter(s -> s%2==0).toArray();
		Arrays.stream(SPares2).forEach(System.out::println);

	}

}
