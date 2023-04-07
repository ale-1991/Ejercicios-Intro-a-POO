/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
Circunferencia c = new Circunferencia(5); // Se crea una nueva circunferencia con radio 5
System.out.println("Radio: " + c.getRadio()); // Imprime "Radio: 5.0"
System.out.println("Área: " + c.area()); // Imprime "Área: 78.53981633974483"
System.out.println("Perímetro: " + c.perimetro()); // Imprime "Perímetro: 31.41592653589793"

c.setRadio(3); // Se cambia el radio a 3
System.out.println("Radio: " + c.getRadio()); // Imprime "Radio: 3.0"

c.crearCircunferencia(7); // Se crea una nueva circunferencia con radio 7
System.out.println("Radio: " + c.getRadio()); // Imprime "Radio: 7.0"
System.out.println("Área: " + c.area()); // Imprime "Área: 153.93804002589985"
System.out.println("Perímetro: " + c.perimetro()); // Imprime "Perímetro: 43.982297150257104"

    }
}
