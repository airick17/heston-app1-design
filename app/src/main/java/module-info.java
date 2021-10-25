module heston.app.design.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens baseline to javafx.fxml;
    exports baseline;
}