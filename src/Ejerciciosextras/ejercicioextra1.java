/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package Ejerciciosextras;

/**
 *
 * @author Alejandro Estudios
 */
public class ejercicioextra1 {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Amor , amar", "Camilo Sesto");
        
  // Imprimir el título y autor de la canción usando los getters
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
  // crear nueva cancion usando set
  
  
       Cancion cancion2 = new Cancion();
       cancion2.setTitulo("Waiting for a girl like you");
       cancion2.setAutor("Foreigner");
       
  
  
        System.out.println("Título: " + cancion2.getTitulo());
        System.out.println("Autor: " + cancion2.getAutor());
    }
    
}
