module com.mycompany.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.olamundojavafx to javafx.fxml;
    exports com.mycompany.olamundojavafx;
}
