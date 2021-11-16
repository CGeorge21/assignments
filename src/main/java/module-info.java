module pachyderm {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens pachyderm to javafx.fxml;
    exports pachyderm;
}