module com.margon.clinica {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires com.dlsc.formsfx;
    // requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.margon.clinica to javafx.fxml;
    exports com.margon.clinica;
}
