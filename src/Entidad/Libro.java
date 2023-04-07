/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Alejandro Estudios
 */
public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeropag;
    
    //CONTRUCTOR POR PARAMETROS 
    
    public Libro(String ISBN,String titulo,String autor,int numeropag) {
        this.ISBN = ISBN ;
        this.titulo = titulo;
        this.autor= autor;
        this.numeropag = numeropag;  
    }
    // Constructor vacío
    
    public Libro(){
        
    }
    
    // Método para cargar un libro pidiendo los datos al usuario
    
    public void cargarLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de ISBN: ");
        this.ISBN = sc.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = sc.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.numeropag = sc.nextInt(); 
        
    }
    
        // Método para informar los datos del libro
    public void informarLibro() {
        System.out.println("Número de ISBN: " + this.ISBN);
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Autor del libro: " + this.autor);
        System.out.println("Número de páginas: " + this.numeropag);
    }
    
}

