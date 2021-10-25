module heston.app1.design.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens baseline to javafx.fxml;
    exports baseline;
}