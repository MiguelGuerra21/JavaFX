
/**
 * Se pide que crees un nuevo proyecto con una clase llamada Conversacion 
 * y otra clase llamada Comentario. La clase Conversacion debe disponer de 
 * un método main. Cuando se invoca a este método main debe aparecer una 
 * nueva ventana donde se muestren 2 campos donde el usuario puede escribir 
 * y un boton. El primer campo representa el nombre de la persona y el segundo
 * el comentario a realizar. Al hacer clic en el boton debe crearse un objeto 
 * Comentario que debe ser mostrado en la parte inferior de la ventana. 
 * Se podrán hacer tantos comentarios como se desee.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comentario
{
    private String nombre;
    private String comentario;

    /**
     * Constructor for objects of class Comentario
     */
    public Comentario(String nombre, String comentario)
    {
        this.nombre = nombre;
        this.comentario = comentario;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        String cadenaAMostrar = "";
        cadenaAMostrar = "Nombre : " + nombre + "\n Comentario : " +comentario;
        return cadenaAMostrar;
    }
}
