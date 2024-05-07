module dune.file.dunetextgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens dune.file.dunetextgame to javafx.fxml;
    exports dune.file.dunetextgame;
}