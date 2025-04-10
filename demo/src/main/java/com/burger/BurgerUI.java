package com.burger;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BurgerUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Integer numBurgers;

        // Keeping this right now to remind myself of how javafx works

        // Label nameLabel = new Label("What is your name");
        // TextField nameEntry = new TextField();
        // Label numberLabel = new Label("What is your number");
        // TextField numberEntry = new TextField();
        // Label emailLabel = new Label("What is your email");
        // TextField emailEntry = new TextField();
        // Button displayButton = new Button("Display");

        // displayButton.setOnAction(new EventHandler<ActionEvent>() {
        // @Override
        // public void handle(ActionEvent e) {
        // Label newNameLabel = new Label(nameEntry.getText());
        // Label newNumberLabel = new Label(numberEntry.getText());
        // Label newEmailLabel = new Label(emailEntry.getText());

        // VBox root = new VBox();
        // root.getChildren().add(newNameLabel);
        // root.getChildren().add(newNumberLabel);
        // root.getChildren().add(newEmailLabel);

        // Scene newScene = new Scene(root, 640, 480);
        // stage.setScene(newScene);
        // }
        // });

        Label titleLabel = new Label("Keaghon's Burger Restaraunt");
        Button makeBurger = new Button("Make burger");

        VBox root = new VBox();
        // root.getChildren().add(nameLabel);

        root.getChildren().add(titleLabel);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}