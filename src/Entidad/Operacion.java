/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class Operacion {
    private double numero1,numero2;
    
    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1,double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //b) Método constructor sin los atributos pasados por parámetro.
    public Operacion (){
        
    }
    //c) Métodos get y set.
    
    public double getNumero1(){
        return numero1;
    }
    
    public void setNumero1(double numero1){
        this.numero1 = numero1;
        
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    
    //d) Método para crearOperacion(): que le pide al usuario los dos
//números y los guarda en los atributos del objeto.
    
public void crearOperacion(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    this.numero1 = scanner.nextDouble();
    System.out.println("Ingrese el segundo numero");
    this.numero2 = scanner.nextDouble();
}

    
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public double sumar(){
        return numero1 + numero2;
    }
    
  //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public double restar(){
        return numero1 - numero2;
    }
    
    /*g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
*/
    public double multiplicar(){
        if(numero1==0 || numero2==0){
            System.out.println("No se puede multiplicar por cero");
            return 0;
        }else{
            return numero1*numero2;
        }
    }
   /*h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.*/
    public double dividir(){
        if(numero2==0){
            System.out.println("No se puede dividir por cero");
            return 0;
        }else{
            return numero1/numero2;
        }
            
    }
    
}
