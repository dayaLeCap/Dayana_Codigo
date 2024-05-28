module com.example.dayanacodigofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dayanacodigofinal to javafx.fxml;
    exports com.example.dayanacodigofinal;
}