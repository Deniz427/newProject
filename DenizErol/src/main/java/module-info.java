module org.example.denizerol {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.denizerol to javafx.fxml;
    exports org.example.denizerol;
}