module com.example.miniwebbrowser {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.miniwebbrowser to javafx.fxml;
    exports com.example.miniwebbrowser;
}