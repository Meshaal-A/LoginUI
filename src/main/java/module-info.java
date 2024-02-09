module com.example.loginform {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginform to javafx.fxml;
    exports com.example.loginform;
}