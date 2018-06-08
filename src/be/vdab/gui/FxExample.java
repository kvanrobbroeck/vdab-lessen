package be.vdab.gui;

import be.vdab.beehive.Bee;
import be.vdab.beehive.Soldier;
import be.vdab.beehive.Worker;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FxExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox p = new HBox(10);

        p.getChildren().add(new MyCoolButton());
        p.getChildren().add(new RadioButton("RADIO"));
        p.getChildren().add(new CheckBox("CHECK"));
        Button bla = new Button("klik3");
        bla.setEffect(new GaussianBlur(10));
        p.getChildren().add(bla);
        p.getChildren().add(new Button("klik4"));
        p.getChildren().add(new Button("klik4"));
        p.getChildren().add(new Label("klik4"));

        Scene sc = new Scene(p);

        primaryStage.setScene(sc);
        primaryStage.setWidth(640);
        primaryStage.setHeight(480);
        primaryStage.show();
    }
}
