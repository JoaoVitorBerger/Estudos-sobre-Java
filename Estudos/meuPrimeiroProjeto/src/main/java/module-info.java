module com.example.meuprimeiroprojeto {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.meuprimeiroprojeto to javafx.fxml;
    exports com.example.meuprimeiroprojeto;
}