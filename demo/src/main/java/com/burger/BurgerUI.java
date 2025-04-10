package com.burger;

import java.io.IOException;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BurgerUI extends Application {

    Integer numBurgers = 0;
    Integer numPatties = 0;

    // Make the lists to hold the items of the burger. Will be added to and removed with the buttons
    List<String> patties;
    List<String> cheeses;
    List<String> garnishes;

    Label titleLabel = new Label("Keaghon's Burger Restaraunt");
    Button makeBurger = new Button("Make burger");

    // Could not think of a way around not making these global and I am running out of time
    Button addBeefPatty = new Button("Add beef patty");
    Button addVeggiePatty = new Button("Add veggie patty");
    Button addImpossiblePatty = new Button("Add impossible patty");
    Button addTurkeyPatty = new Button("Add turkey patty");

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();

        makeBurger.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                numBurgers += 1;

                root.getChildren().clear();

                Label bunLabel = new Label("Choose bun type");
                ObservableList<String> bunOptions = FXCollections.observableArrayList(
                        "Brioche",
                        "Sesame Seed",
                        "Potato");
                ComboBox bunComboBox = new ComboBox(bunOptions);

                Label pattyLabel = new Label("Patties (Max 4):");

                // Horizontal box to hold all the patty choices
                HBox pattyChoiceDisplay = new HBox();
                pattyChoiceDisplay.getChildren().addAll(addBeefPatty, addVeggiePatty, addImpossiblePatty, addTurkeyPatty);

                // Adding all the nodes to the screen
                root.getChildren().addAll(bunLabel, bunComboBox, pattyLabel, pattyChoiceDisplay);

            }
        });

        addBeefPatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() > 4) {
                    Label tooManyPattiesLabel = new Label("Only 4 patties");
                    root.getChildren().add(tooManyPattiesLabel);
                } else {
                    patties.add("Beef Patty");
                }
            }
        });

        addVeggiePatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() > 4) {
                    Label tooManyPattiesLabel = new Label("Only 4 patties");
                    root.getChildren().add(tooManyPattiesLabel);
                } else {
                    patties.add("Veggie Patty");
                }
            }
        });

        addImpossiblePatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() > 4) {
                    Label tooManyPattiesLabel = new Label("Only 4 patties");
                    root.getChildren().add(tooManyPattiesLabel);
                } else {
                    patties.add("Impossible Patty");
                }
            }
        });

        addTurkeyPatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() > 4) {
                    Label tooManyPattiesLabel = new Label("Only 4 patties");
                    root.getChildren().add(tooManyPattiesLabel);
                } else {
                    patties.add("Turkey Patty");
                }
            }
        });

        root.getChildren().add(titleLabel);
        root.getChildren().add(makeBurger);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}