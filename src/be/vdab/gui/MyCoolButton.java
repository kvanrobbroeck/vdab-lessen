package be.vdab.gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class MyCoolButton extends Button {
    public MyCoolButton() {
        super("COOL BUTTON");

        setEffect(new Reflection());

        Color c = Color.color(1, 1, 0);

        BackgroundFill f = new BackgroundFill(c, CornerRadii.EMPTY, new Insets(0));
        setBackground(new Background(f));
    }
}
