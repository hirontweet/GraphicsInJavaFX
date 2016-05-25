/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsinjavafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author spaism
 */
public class GraphicsInJavaFX extends Application {
    
    Circle circle_red, circle_blue;
    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;
    
    @Override
    public void start(Stage primaryStage) {
        
        circle_red = new Circle(100, 100, 50);
        circle_red.setFill(Color.RED);
        circle_red.setOnMousePressed(circlePressedHandler);
        circle_red.setOnMouseDragged(circleDraggedHandler);
        
        circle_blue = new Circle(250, 250, 50);
        circle_blue.setFill(Color.BLUE);
        circle_blue.setOnMousePressed(circlePressedHandler);
        circle_blue.setOnMouseDragged(circleDraggedHandler);
        
        Group root = new Group();
        root.getChildren().addAll(circle_red, circle_blue);
        
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
    EventHandler<MouseEvent> circlePressedHandler = new EventHandler<MouseEvent>(){
    
        @Override
        public void handle(MouseEvent e){
            orgSceneX = e.getSceneX();
            orgSceneY = e.getSceneY();
            orgTranslateX = ((Circle)(e.getSource())).getTranslateX();
            orgTranslateY = ((Circle)(e.getSource())).getTranslateY();
        }
    };
    
    
    EventHandler<MouseEvent> circleDraggedHandler = new EventHandler<MouseEvent>(){
        
        @Override
        public void handle(MouseEvent e){
            double offsetX = e.getSceneX() - orgSceneX;
            double offsetY = e.getSceneY() - orgSceneY;
            double newTranslateX = orgTranslateX + offsetX;
            double newTranslateY = orgTranslateY + offsetY;
            
            ((Circle)(e.getSource())).setTranslateX(newTranslateX);
            ((Circle)(e.getSource())).setTranslateY(newTranslateY);
        }
    };
    
    
}
