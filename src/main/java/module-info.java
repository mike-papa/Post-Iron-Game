module com.example.postirongame {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires com.fasterxml.jackson.databind;


    opens com.example.postirongame to javafx.fxml;
    exports com.example.postirongame;
    exports com.example.postirongame.gameCharacter;
    exports com.example.postirongame.controller;
    opens com.example.postirongame.controller to javafx.fxml;

}