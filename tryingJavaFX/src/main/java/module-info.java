module com.example.tryingjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tryingjavafx to javafx.fxml;
    exports com.example.tryingjavafx;
}