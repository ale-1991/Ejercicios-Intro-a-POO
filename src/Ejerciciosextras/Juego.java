/*
Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de 
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo
jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número
y el número de veces que cada jugador ha ganado.
 */
package Ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class Juego {
    
    private int jugador1_ganados;
    private int jugador2_ganados;
    
    public Juego() {
        this.jugador1_ganados = 0;
        this.jugador2_ganados = 0;
    }
    
    public void iniciar_juego(){
        Scanner sc = new Scanner(System.in);
        int numero_secreto;
        int intentos=0;
        
        System.out.println("JUGADOR NUMERO 1, Ingrese cual será el número secreto");
        numero_secreto= sc.nextInt();
        
        System.out.println("JUGADOR NUMERO 2, intente adivinar el numero secreto, posee 5 intentos");
      
        
        while(intentos<5){
            
            System.out.println("Intento #"+ (intentos+1));
            int intento = sc.nextInt();
            intentos++;
            
            if(intento==numero_secreto){
                System.out.println("ACERTASTE!! ganaste una partida!");
                this.jugador2_ganados ++;
                return;
            }else if (intento<numero_secreto) {
                System.out.println("Más alto...");
            }else{
                System.out.println("Más bajo...");
            }
            
        }
        System.out.println("Intentos acabados! El numero secreto era: "+numero_secreto+" .");
        this.jugador1_ganados++;
        
    }
    
    public int getJugador1(){
        return this.jugador1_ganados;
    }
        public int getJugador2(){
        return this.jugador2_ganados;
    }
}
