/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsinjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author spaism
 */
public class GraphicsInJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Group root = new Group();
        
        gc.setLineWidth(2.0);
        // Strokeの色の設定(BLACK)
        gc.setStroke(Color.BLACK);
        gc.strokeLine(10, 10, 230, 10);
        
        // Fillの色を設定(DARKORANGE)
        gc.setFill(Color.DARKORANGE);
        gc.fillRect(15, 25, 100, 100);
        
        // Strokeの色を変更(BLACK -> GREEN)
        gc.setStroke(Color.GREEN);
        gc.strokeOval(150, 40, 50, 80);
        
        root.getChildren().add(canvas);
        
        primaryStage.setScene(new Scene(root, 300, 200));
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
