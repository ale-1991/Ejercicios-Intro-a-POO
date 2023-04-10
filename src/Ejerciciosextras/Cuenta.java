/*
. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.

 */
package Ejerciciosextras;
import java.util.Scanner;
/**
 *
 * @author Alejandro Estudios
 */
public class Cuenta {
    private double saldo= 10000;
    private String titular= "Bernardo Camela";
    
    public Cuenta(){
        
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo= saldo;
    }
    
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public void retirar_dinero(){
        Scanner sc = new Scanner(System.in);
        double retiro;
        

        
        do {
            System.out.print("Ingrese la cantidad a retirar: ");
            retiro = sc.nextDouble();
        if(retiro<=saldo){
            System.out.println("Realizando extracción...");
            System.out.println("Su extracción ha sido exitosa!");
            System.out.println("Su nuevo saldo es de: $"+(saldo-retiro));
            break;
        }else{
            System.out.println("La cantidad ingresada supera el maximo de saldo");
            System.out.println("Su saldo es de: $ "+this.saldo+" .Ingrese un monto menor");
        }
            
        } while (retiro <= 0 || retiro > saldo);
        

    }
            
}
