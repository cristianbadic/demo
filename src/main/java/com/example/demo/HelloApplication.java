package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        //varianta din tutorial
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setScene(new Scene(root, 320, 240));


        //we create a root node to arrange all the other nodes
        //Group root = new Group();
        //add the root node to the scene
        //Scene scene = new Scene(root,600, 600, Color.LIGHTBLUE);
        //stage.setTitle("Stage Demo");
        //stage.setWidth(420);
        //stage.setHeight(420);
        //stage.setResizable(false);

        //text works as a scene
        Text text = new Text();
        text.setText("Etwas");
        text.setX(50);
        text.setY(50);

        //root.getChildren().add(text);
        //adding the scene to the stage

        //din original
        //stage.setTitle("Hello");
        //stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //eventually the start method will be called behind the scenes
        launch();
    }
}