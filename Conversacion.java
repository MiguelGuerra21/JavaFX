import javafx.application.Application;
import javafx.stage.Stage; 
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
public class Conversacion extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Prueba2");
        Group contenedor = new Group();
        Scene escena = new Scene(contenedor , 700 , 1000);
        Button boton = new Button("Enviar");
        Label nombre = new Label("Nombre: ");
        Label comentario = new Label("Comentario : ");
        TextField texto1 = new TextField("Introduzca aquí su nombre...");
        TextField texto2 = new TextField("Introduzca aquí su comentario...");

        boton.setLayoutX(10);
        boton.setLayoutY(200);

        boton.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event)
                {
                    Label comentarioAMostrar = new Label();
                    if ((texto1.getText() != null && texto2.getText() != null && !texto1.getText().isEmpty() && !texto2.getText().isEmpty())) {
                        Comentario comentarioActual = new Comentario(texto1.getText() , texto2.getText());
                        comentarioAMostrar.setText(comentarioActual.toString());
                        comentarioAMostrar.setLayoutX(0);
                        comentarioAMostrar.setLayoutY(250);
                        contenedor.getChildren().add(comentarioAMostrar);
                    }
                    else {
                        comentarioAMostrar.setText("Rellena los campos");
                        comentarioAMostrar.setLayoutX(0);
                        comentarioAMostrar.setLayoutY(250);
                        contenedor.getChildren().add(comentarioAMostrar);
                    }
                }
            });

        nombre.setLayoutX(14);
        nombre.setLayoutY(10);

        comentario.setLayoutX(10);
        comentario.setLayoutY(80);

        texto1.setLayoutX(80);
        texto1.setLayoutY(10);

        texto2.setLayoutX(10);
        texto2.setLayoutY(100);
        texto2.setPrefWidth(300);
        texto2.setPrefHeight(80);

        contenedor.getChildren().add(boton);
        contenedor.getChildren().add(nombre);
        contenedor.getChildren().add(comentario);
        contenedor.getChildren().add(texto1);
        contenedor.getChildren().add(texto2);
        

        primaryStage.setScene(escena);
        primaryStage.show();
    }
}
