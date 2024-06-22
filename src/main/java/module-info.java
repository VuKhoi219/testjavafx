module org.example.student {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.student to javafx.fxml;
    opens Controller to java.compiler , javafx.fxml;
    opens Entity to javafx.fxml, java.compiler,javafx.base;
    opens Repository to javafx.fxml, javafx.base;
    exports Controller to java.compiler,javafx.fxml;
    exports org.example.student;
    exports Entity to javafx.fxml;
    exports Repository to javafx.fxml;
}