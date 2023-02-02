package Ejercicio4_Baraja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Clase que contiene la lista de jugadores y métodos 
 * Crear jugadores, repartir cartas y visualizar cada juego
 * 
 * @author lorena.acedo.vazquez
 *
 */

public class Juego {

	
    static Baraja baraja;
    static Set<Carta>cartas;
    
    static int CARTAS=5;//Número de cartas repartidas
    static String TIPO_BARAJA=Baraja.POKER;
    
    static Set<Jugador> jugadores;
    
    public static void main(String[]args) {
    	
    	/**
    	 * Listará todas las cartas de la baraja
    	 */
    	Baraja baraja = new Baraja();
        baraja.crearBaraja();
        System.out.println("Cartas en la baraja: ");
        
        for(Carta cartas:baraja.getBaraja()) {//Muestra las cartas cada una en una linea
        	System.out.println(cartas);
        }
        
        /**
         * Mostramos los jugadores
         */
        
        Jugador juego = new Jugador();
	    juego.cargarJugador(new Jugador("Jugador 1", 25));
	    juego.cargarJugador(new Jugador("Jugador 2", 30));
	    juego.MostrarJugadores();
	    juego.visualiza(jugadores);
	    juego.incializar();
	    baraja.barajar();
	    	 
	  }
	    
		/**
		 * Iniciamos el juego
		 */
	    public void inicializar() {
	        for (int i = 0; i < 4; i++) {
	          for (int j = 0; j < Carta.NUMERO_CARTAS; j++) {
	            baraja.add(new Carta(j + i, palos[i]));
	          }
	        }
	      }
    
    }
	


