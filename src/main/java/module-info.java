module com.anaandemi.academiapoli {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anaandemi.academiapoli to javafx.fxml;
    exports com.anaandemi.academiapoli;
}