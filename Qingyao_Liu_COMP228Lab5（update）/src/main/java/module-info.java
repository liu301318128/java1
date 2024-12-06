module com.example.qingyao_liu_comp228lab5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.qingyao_liu_comp228lab5 to javafx.fxml;
    exports com.example.qingyao_liu_comp228lab5;
}