package com.burger;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BurgerUI extends Application {

    Integer numBurgers = 0;
    Integer numPatties = 0;

    // Make the lists to hold the items of the burger. Will be added to and removed
    // with the buttons
    List<String> patties = new ArrayList<String>();
    List<String> cheeses = new ArrayList<String>();
    List<String> garnishes = new ArrayList<String>();
    List<Burger> burgers = new ArrayList<Burger>();

    Label titleLabel = new Label("Keaghon's Burger Restaraunt");
    Button makeBurger = new Button("Make burger");
    Button receiptButton = new Button("Show receipt");

    // Could not think of a way around not making these global and I am running out
    // of time
    ObservableList<String> bunOptions = FXCollections.observableArrayList(
            "Brioche",
            "Sesame Seed",
            "Potato");
    ComboBox bunComboBox = new ComboBox(bunOptions);

    // Patty buttons
    Button addBeefPatty = new Button("Add beef patty");
    Button addVeggiePatty = new Button("Add veggie patty");
    Button addImpossiblePatty = new Button("Add impossible patty");
    Button addTurkeyPatty = new Button("Add turkey patty");

    // Cheese buttons
    Button addAmericanSlice = new Button("Add american patty");
    Button addGoudaSlice = new Button("Add gouda patty");
    Button addCheddarSlice = new Button("Add cheddar patty");
    Button addProvoloneSlice = new Button("Add provolone patty");

    // Garnish Buttons
    Button addLettuceButton = new Button("Add Lettuce");
    Button addTomatoButton = new Button("Add Tomato");
    Button addOnionsButton = new Button("Add Onions");
    Button addPicklesButton = new Button("Add pickles");

    // Create burger button
    Button createBurgerButton = new Button("Create burger");

    // Alert for when they select too many options
    Alert alert = new Alert(AlertType.ERROR);

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();

        makeBurger.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                numBurgers += 1;

                root.getChildren().clear();

                Label bunLabel = new Label("Choose bun type");

                Label pattyLabel = new Label("Patties (Max 4):");

                // Horizontal box to hold all the patty choices
                HBox pattyChoiceDisplay = new HBox();
                pattyChoiceDisplay.getChildren().addAll(addBeefPatty, addVeggiePatty, addImpossiblePatty,
                        addTurkeyPatty);

                Label cheesesLabel = new Label("Cheeses (Max 4):");

                // Horizontal box to hold all the cheese choices
                HBox cheeseChoiceDisplay = new HBox();
                cheeseChoiceDisplay.getChildren().addAll(addAmericanSlice, addGoudaSlice, addCheddarSlice,
                        addProvoloneSlice);

                Label garnishesLabel = new Label("Cheeses (Max 4):");

                // Horizontal box to hold all the patty choices
                HBox garnishesChoiceDisplay = new HBox();
                garnishesChoiceDisplay.getChildren().addAll(addLettuceButton, addTomatoButton, addOnionsButton,
                        addPicklesButton);

                // Adding all the nodes to the screen
                root.getChildren().addAll(bunLabel, bunComboBox, pattyLabel, pattyChoiceDisplay, cheesesLabel,
                        cheeseChoiceDisplay, garnishesLabel, garnishesChoiceDisplay, createBurgerButton);

            }
        });

        // Patty button functionalities
        addBeefPatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() >= 4) {
                    alert.setContentText("Only 4 patties!");
                    alert.showAndWait();
                } else {
                    patties.add("Beef Patty");
                }
            }
        });

        addVeggiePatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() >= 4) {
                    alert.setContentText("Only 4 patties!");
                    alert.showAndWait();
                } else {
                    patties.add("Veggie Patty");
                }
            }
        });

        addImpossiblePatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() >= 4) {
                    alert.setContentText("Only 4 patties!");
                    alert.showAndWait();
                } else {
                    patties.add("Impossible Patty");
                }
            }
        });

        addTurkeyPatty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (patties.size() >= 4) {
                    alert.setContentText("Only 4 patties!");
                    alert.showAndWait();
                } else {
                    patties.add("Turkey Patty");
                }
            }
        });

        // Cheese button functionalities
        addAmericanSlice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (cheeses.size() >= 4) {
                    alert.setContentText("Only 4 cheeses!");
                    alert.showAndWait();
                } else {
                    cheeses.add("American");
                }
            }
        });

        addGoudaSlice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (cheeses.size() >= 4) {
                    alert.setContentText("Only 4 cheeses!");
                    alert.showAndWait();
                } else {
                    cheeses.add("Gouda");
                }
            }
        });

        addCheddarSlice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (cheeses.size() >= 4) {
                    alert.setContentText("Only 4 cheeses!");
                    alert.showAndWait();
                } else {
                    cheeses.add("Cheddar");
                }
            }
        });

        addProvoloneSlice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (cheeses.size() >= 4) {
                    alert.setContentText("Only 4 cheeses!");
                    alert.showAndWait();
                } else {
                    cheeses.add("Provolone");
                }
            }
        });

        // Garnish button functionalities
        addLettuceButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (garnishes.size() >= 4) {
                    alert.setContentText("Only 4 garnishes!");
                    alert.showAndWait();
                } else {
                    garnishes.add("Lettuce");
                }
            }
        });

        addTomatoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (garnishes.size() >= 4) {
                    alert.setContentText("Only 4 garnishes!");
                    alert.showAndWait();
                } else {
                    garnishes.add("Tomato");
                }
            }
        });

        addOnionsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (garnishes.size() >= 4) {
                    alert.setContentText("Only 4 garnishes!");
                    alert.showAndWait();
                } else {
                    garnishes.add("Onions");
                }
            }
        });

        addPicklesButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (garnishes.size() >= 4) {
                    alert.setContentText("Only 4 garnishes!");
                    alert.showAndWait();
                } else {
                    garnishes.add("Pickles");
                }
            }
        });

        createBurgerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Burger burger = new Burger(bunComboBox.getValue().toString(), patties, cheeses, garnishes);
                burgers.add(burger);

                // Clear the lists for reusability
                bunComboBox.setValue(null);
                patties.clear();
                cheeses.clear();
                garnishes.clear();

                // Clear and go back to main screen
                root.getChildren().clear();

                root.getChildren().addAll(titleLabel, makeBurger, receiptButton);

            }
        });

        receiptButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                root.getChildren().clear();

                Integer burgerNumber = 1;
                for (Burger burger : burgers) {
                    Label burgerPriceLabel = new Label("Burger " + burgerNumber + ": $" + burger.getPrice());
                    root.getChildren().add(burgerPriceLabel);
                    burgerNumber += 1;
                }
            }
        });

        root.getChildren().addAll(titleLabel, makeBurger, receiptButton);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}