module com.example.hourmineraktuell {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hourmineraktuell to javafx.fxml;
    exports com.example.hourmineraktuell;
}