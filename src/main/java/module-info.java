module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jfxtras.labs;


    opens com.example.demo5 to javafx.fxml;
    exports com.example.demo5;
}