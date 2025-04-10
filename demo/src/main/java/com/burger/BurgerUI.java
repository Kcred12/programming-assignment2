package com.burger;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BurgerUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Integer numBurgers;

        Label titleLabel = new Label("Keaghon's Burger Restaraunt");
        Button makeBurger = new Button("Make burger");

        VBox root = new VBox();
        // root.getChildren().add(nameLabel);

        makeBurger.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                root.getChildren().clear();

                Label bunLabel = new Label("Choose bun type");
                ObservableList<String> bunOptions = FXCollections.observableArrayList(
                        "Brioche",
                        "Sesame Seed",
                        "Potato");
                ComboBox bunComboBox = new ComboBox(bunOptions);

                Label pattyLabel = new Label("Patties (Max 4):");

            }
        });

        root.getChildren().add(titleLabel);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}