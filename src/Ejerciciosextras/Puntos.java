/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese X1 ");
        this.x1 = leer.nextDouble();
        System.out.println("Ingrese Y1 ");
        this.y1 = leer.nextDouble();
        System.out.println("Ingrese X2 ");
        this.x2 = leer.nextDouble();
        System.out.println("Ingrese Y2 ");
        this.y2 = leer.nextDouble();
    }
    //x2-x1 2 +y2-y1 2  2
    
    public void calcular(){
        
        double distancia = Math.sqrt(Math.pow((x2- x1), 2)+ Math.pow((y2-y1), 2));
        System.out.println("La distancia es: " + distancia);
    }
    
}
