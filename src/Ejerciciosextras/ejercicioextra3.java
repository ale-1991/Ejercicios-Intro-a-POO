/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
a dos jugadores jugar un juego de adivinanza de números. El primer jugador elige un número
y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el
segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios
para adivinar 
el número y el número de veces que cada jugador ha ganado.
 */
package Ejerciciosextras;

/**
 *
 * @author Alejandro Estudios
 */
public class ejercicioextra3 {
    public static void main(String[] args) {
        
       Juego juego = new Juego();
       //para jugar 3 veces
        for(int i=0;i<3;i++){
            juego.iniciar_juego();
        }
        
        System.out.println("Jugador 1 ganó " + juego.getJugador1() + " veces.");
        System.out.println("Jugador 2 ganó " + juego.getJugador2() + " veces.");
    }
}

