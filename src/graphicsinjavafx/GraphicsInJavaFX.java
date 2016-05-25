/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsinjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author spaism
 */
public class GraphicsInJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle circle = new Circle(150, 150, 50);
        circle.setFill(Color.BLUE);
        
        Ellipse ellipse = new Ellipse(150, 45, 60, 30);
        ellipse.setFill(Color.CRIMSON);
        
        Line line1 = new Line(10, 80, 200, 80);
        line1.setStroke(Color.BLACK);
        Line line2 = new Line(10, 90, 200, 90);
        line2.setStroke(Color.BLUEVIOLET);
        
        Group root = new Group();
        root.getChildren().addAll(circle, ellipse, line1, line2);
        
        Scene scene = new Scene(root, 300, 200);
        
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
    
}
