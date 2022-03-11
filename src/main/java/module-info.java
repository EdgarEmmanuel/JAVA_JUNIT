module com.example.test_java_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.junit.jupiter.api;

    opens com.example.test_java_fx to javafx.fxml;
    exports com.example.test_java_fx;
}