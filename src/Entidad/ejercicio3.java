/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Alejandro Estudios
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Operacion operacion1 = new Operacion();
        operacion1.crearOperacion();

        System.out.println("Suma: " + operacion1.sumar());
        System.out.println("Resta: " + operacion1.restar());
        System.out.println("Multiplicación: " + operacion1.multiplicar());
        System.out.println("División: " + operacion1.dividir());

    }

    
}
