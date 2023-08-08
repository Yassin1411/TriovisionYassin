module com.example.triovisionyassin {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires net.synedra.validatorfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;
  requires eu.hansolo.tilesfx;
  requires com.almasb.fxgl.all;

  opens com.example.triovisionyassin to javafx.fxml;
  exports com.example.triovisionyassin;
    exports com.example.triovisionyassin.Jeu;
    opens com.example.triovisionyassin.Jeu to javafx.fxml;
}
