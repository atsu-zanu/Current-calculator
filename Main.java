package com.example.currentcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/current_calculator.fxml"));
            primaryStage.setTitle("Current Calculator");
            primaryStage.setScene(new Scene(root, 500, 400));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
