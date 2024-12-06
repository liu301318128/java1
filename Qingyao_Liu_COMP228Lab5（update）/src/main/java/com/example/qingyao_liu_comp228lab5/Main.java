package com.example.qingyao_liu_comp228lab5;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        DatabaseHelper dbHelper = new DatabaseHelper();
        dbHelper.testConnection();


        PlayerGameApp app = new PlayerGameApp();
        app.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
