/*
. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.

 */
package Ejerciciosextras;

/**
 *
 * @author Alejandro Estudios
 */
public class ejercicioextra4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        //el saldo es de $10000
        c1.getSaldo();
        c1.getTitular();
        c1.retirar_dinero();
    }
}
