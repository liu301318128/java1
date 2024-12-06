package com.example.qingyao_liu_comp228lab5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.ResultSet;

public class PlayerGameApp extends Application {
    private DatabaseHelper dbHelper = new DatabaseHelper();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Player and Game Manager");

        // Fields for inserting player information
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField addressField = new TextField();
        TextField postalCodeField = new TextField();
        TextField provinceField = new TextField();
        TextField phoneNumberField = new TextField();

        Button insertPlayerButton = new Button("Insert Player");
        insertPlayerButton.setOnAction(e -> {
            try {
                dbHelper.insertPlayer(
                        firstNameField.getText(),
                        lastNameField.getText(),
                        addressField.getText(),
                        postalCodeField.getText(),
                        provinceField.getText(),
                        phoneNumberField.getText()
                );
                showAlert("Success", "Player inserted successfully!");
            } catch (Exception ex) {
                ex.printStackTrace();
                showAlert("Error", "Failed to insert player: " + ex.getMessage());
            }
        });

        // Fields for querying player and game information
        TextField playerIdField = new TextField();
        Button queryButton = new Button("Query Player Games");
        TextArea resultArea = new TextArea();

        queryButton.setOnAction(e -> {
            try {
                int playerId = Integer.parseInt(playerIdField.getText());
                ResultSet rs = dbHelper.getPlayerAndGames(playerId);
                StringBuilder results = new StringBuilder();
                while (rs.next()) {
                    results.append("Player: ").append(rs.getString("first_name")).append(" ").append(rs.getString("last_name"))
                            .append("\nGame: ").append(rs.getString("game_title"))
                            .append("\nDate: ").append(rs.getDate("playing_date"))
                            .append("\nScore: ").append(rs.getInt("score"))
                            .append("\n\n");
                }
                resultArea.setText(results.toString());
            } catch (Exception ex) {
                ex.printStackTrace();
                showAlert("Error", "Failed to query data: " + ex.getMessage());
            }
        });

        // Layouts
        GridPane insertPane = new GridPane();
        insertPane.setPadding(new Insets(10));
        insertPane.setHgap(10);
        insertPane.setVgap(10);
        insertPane.add(new Label("First Name:"), 0, 0);
        insertPane.add(firstNameField, 1, 0);
        insertPane.add(new Label("Last Name:"), 0, 1);
        insertPane.add(lastNameField, 1, 1);
        insertPane.add(new Label("Address:"), 0, 2);
        insertPane.add(addressField, 1, 2);
        insertPane.add(new Label("Postal Code:"), 0, 3);
        insertPane.add(postalCodeField, 1, 3);
        insertPane.add(new Label("Province:"), 0, 4);
        insertPane.add(provinceField, 1, 4);
        insertPane.add(new Label("Phone Number:"), 0, 5);
        insertPane.add(phoneNumberField, 1, 5);
        insertPane.add(insertPlayerButton, 1, 6);

        VBox queryPane = new VBox(10, new Label("Player ID:"), playerIdField, queryButton, resultArea);
        queryPane.setPadding(new Insets(10));

        HBox mainLayout = new HBox(20, insertPane, queryPane);
        mainLayout.setPadding(new Insets(10));

        primaryStage.setScene(new Scene(mainLayout, 800, 400));
        primaryStage.show();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
