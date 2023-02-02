package Ejercicio4_Baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase con la lista de cartas
 * @author lorena.acedo.vazquez
 *
 */
public class Baraja {
	
	static final String POKER= "Poker";
	static final String[] PALOS_POKER= {"Corazones", "picas", "Trebol", "Diamantes"};
	private Set<Carta> baraja=new HashSet<>();
	private int pasarCarta;


	/**
	 * Creamos constructor
	 */
	public Baraja() {
		this.baraja = new HashSet<Carta>();
		this.pasarCarta = 0;
		crearBaraja();
	}
	
	

	/**
	 * Creamos el get para baraja
	 * @return
	 */
    public Set<Carta> getBaraja() {
		return baraja;
	}



	/**
     * Método para crear la baraja 
     */
	public void crearBaraja() {
		
		String[]palos=Carta.PALOS_POKER;
		baraja = new HashSet<Carta>();
		
		for(int i=0;i<palos.length;i++) {
			
			for(int j=0;j<Carta.NUMERO_CARTAS;j++) {
				
				baraja.add(new Carta(j+i, palos[i]));
				
			}
			
		}
    	
    }
	
	/**
	 * Método para repartir cartas
	 * @return
	 */
	public Carta repartirCarta() {
        if (baraja.isEmpty()) {
            return null;
        }
        Carta carta = baraja.iterator().next();
        baraja.remove(carta);
        return carta;
    }
    
	public void barajar() {
		Collections.shuffle((List<?>) baraja);
	    	
	    } 
       
}


