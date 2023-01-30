package EjercicioDatos;
import java.util.Scanner;
/**
 * Array con contador y bucle For
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class DatosArrayFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numMes=new int[5][7];
		
		
		int contador=0;
		for (int a = 0; a < numMes.length; a++) {
			for (int b = 0; b < numMes[a].length; b++) {
				numMes[a][b]= ++contador;
			}
		}
			
		}

}
