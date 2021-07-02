package com.mycompany.proyectoedds;

import TDA.DoublyLinkedCircularList;
import java.util.Iterator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Proyecto");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
            System.out.println("xd");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
        DoublyLinkedCircularList prueba = new DoublyLinkedCircularList<>();
        
        prueba.addLast(1);
        prueba.addLast(2);
        prueba.addLast(3);
        prueba.addLast(4);
        prueba.addLast(5);
        
        System.out.println(prueba.isEmpty());
        
        for(int i=0; i<prueba.size();i++){
            System.out.println(prueba.get(i));
        }
        System.out.println("Header:"+prueba.get(0));
        
        prueba.moverLista("derecha");
        
        for(int i=0; i<prueba.size();i++){
            System.out.println(prueba.get(i));
        }
        System.out.println("Header:"+prueba.get(0));
    }

}