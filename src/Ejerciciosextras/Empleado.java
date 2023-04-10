/*
. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.

 */
package Ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(){
     
    }
    
    public void calcularAumento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        this.nombre= sc.nextLine();
        
        System.out.println("Ingrese el salario del empleado:");
        this.salario=sc.nextDouble();
        
        System.out.println("Ingrese la edad");
        this.edad = sc.nextInt();

        if (edad>=30){
            System.out.println("El aumento salarial debe ser del 10%");
            System.out.println("El aumento salarial es: $"+ ((salario*10)/100));
            System.out.println("El nuevo salario del empleado "+this.nombre+" total será: $"+(salario*1.1));
        }else{
            System.out.println("El aumento salarial debe ser del 5%");
            System.out.println("El aumento salarial es: $"+((salario*5)/100));
            System.out.println("El nuevo salario del empleado "+this.nombre+" total será: $"+(salario*1.05));
        }
    }
    
    
}
