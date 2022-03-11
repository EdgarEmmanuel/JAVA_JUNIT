module com.example.test_java_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.management;
//    requires org.junit.jupiter.api;
//    requires transitive org.apiguardian.api;
//    requires transitive org.junit.platform.commons;
//    requires transitive org.opentest4j;

    opens com.example.test_java_fx to javafx.fxml, java.management;
    exports com.example.test_java_fx;

}