/*
. Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    // metodo para crear rectangulo
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura=altura;
        
    }
    
    public Rectangulo(){
        
    }
    
    //getters y setters
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base= base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura= altura;
    }
    
    
    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        this.base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        this.altura = sc.nextDouble();
        
    }
    
      // Método para calcular la superficie del rectángulo
    public double calcularSuperficie(){
        return this.base*this.altura;
    }
    
     // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro(){
        return (this.base*this.altura)/2;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
