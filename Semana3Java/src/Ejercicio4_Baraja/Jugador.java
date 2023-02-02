package Ejercicio4_Baraja;
/**
 * Clase con las propiedades de los jugadores
 * @author lorena.acedo.vazquez
 *
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Jugador {
	 private String nombre;
	    private int edad;
	    private List<Jugador> jugadores;
	    private Set<Carta> mano;

	    /**
	     * Introducimos el constructor
	     * Usamos HashSet para evitar duplicados
	     * @param nombre
	     * @param edad
	     */
	    public Jugador(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        jugadores=new ArrayList<>();
	        mano = new HashSet<Carta>();
	    }

	    /**
	     * Constructor vacio
	     */
	    public Jugador() {
			
		}

		/**
	     * Añadimos getter y setter
	     * @return
	     */
	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public Set<Carta> getMano() {
	        return mano;
	    }
	    
	    
	    public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public void setMano(Set<Carta> mano) {
			this.mano = mano;
		}
		
		/**
		 * Método toString
		 */

		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", edad=" + edad + ", mano=" + mano + "]";
		}

		/**
		 * Añadimos los jugadores
		 * @param jugador
		 */
		public void cargarJugador(Jugador jugador) {
			jugadores.add(jugador);
		}
		
		/**
		 * Mostramos los jugadores existentes por pantalla de forma ordenada con su nombre y edad
		 */
		public void MostrarJugadores() {
		    System.out.println("Jugadores:");
		    for (Jugador jugador : jugadores) {
		      System.out.println(jugador);
		    }
		  }
		/**
	     * Este método se encargará de recibir cartas
	     * @param carta
	     */
	    public void recibirCarta(Carta carta) {
	        mano.add(carta);
	    }
	    /**
	     * Visualizamos los jugadores con su nombre y su mano
	     * @param jugadores
	     */
	    public static void visualiza(Set<Jugador>jugadores) {
	    	for(Iterator<Jugador> player=jugadores.iterator();player.hasNext();) {
	    		mostrarJugador(player.next());
	    	}
	    }


		/**
	     * Visualizamos los jugadores con su partida
	     */
	    public static void mostrarJugador(Jugador jugador) {
	            System.out.println(jugador.getNombre() + " tiene las siguientes cartas:");
	            for (Carta carta : jugador.getMano()) {
	                System.out.println(carta.getValor() + " de " + carta.getPalo());
	            }
	            System.out.println();
	        }

		public void incializar() {
			
			
		}

}
