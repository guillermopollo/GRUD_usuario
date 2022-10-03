module com.mycompany.grud_usuario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;

    opens controller to javafx.fxml;
    exports controller;
}
