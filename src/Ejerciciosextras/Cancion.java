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
public class Cancion {
    //atributos
    private String titulo;
    private String autor;
    
    //constructor  que inicializa el titulo y el autor
     public Cancion (){
        
    }
     
     
    //otro constructor reciba como parámetros el título y el autor de la canción.
     
    public Cancion (String titulo, String autor){
        this.titulo= titulo;
        this.autor=autor;
        
    }
    
    //get y set
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
        
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    
   
    
    
}
