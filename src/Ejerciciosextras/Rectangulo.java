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
public class Rectangulo {
    private double lado1;
    private double lado2;
    
    public Rectangulo(){
        
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.lado1= sc.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.lado2= sc.nextInt();
        
        System.out.println("El area del rectangulo es: "+(lado1*lado2));
        
    }
    
}
