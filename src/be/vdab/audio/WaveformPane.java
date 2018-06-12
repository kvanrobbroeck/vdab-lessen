package be.vdab.audio;

import javafx.geometry.Point2D;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

/**
 * Shows graphical representation of datastream generated for the audio DAC.
 */
public class WaveformPane extends Pane {
    private static final Color AXES_COLOR = Color.GRAY;
    private static final Color BACKGROUND_COLOR = Color.color(1, 1, 1);

    private static final double RANGE = 1.0 / 200;  // Fill range of screen viewable time domain, in seconds.

    private Canvas canvas;
    private GraphicsContext context;

//    private CompositeWave wave = new CompositeWave(
//        new Sine(6521, 0.1),
//        new Sine(1574, 0.1),
//        new Sine(267, 0.3),
//        new Sine(574, 0.5),
//        new Sine(200, 0.5)
//    );

    // Triangle
//    private CompositeWave wave = new CompositeWave(
//        new Sine(400, 0.40),
//        new Sine(800, 0.20),
//        new Sine(1200, 0.10),
//        new Sine(1600, 0.05),
//        new Sine(2000, 0.025)
//    );

    // Square
    private CompositeWave wave = new CompositeWave(
            new Sine(400, 0.50),
            new Sine(400 * 3, 0.50 / 3),
            new Sine(400 * 5, 0.50 / 5),
            new Sine(400 * 7, 0.50 / 7)
    );

    // A4 440Hz
//    private CompositeWave wave = new CompositeWave(new Sine(440));

    private boolean discrete = false;
    private int sampleRate;

    public WaveformPane() {
        this.canvas = new Canvas(getWidth(), getHeight());
        this.canvas.widthProperty().bind(widthProperty());
        this.canvas.heightProperty().bind(heightProperty());
        this.canvas.widthProperty().addListener(o -> draw());
        this.canvas.heightProperty().addListener(o -> draw());
        this.getChildren().add(this.canvas);
    }

    public void draw() {
        this.context = canvas.getGraphicsContext2D();
        clearScreen();
        drawWaveform(Color.RED);
        drawAxes();
    }

    private void drawWaveform(Color color) {
        context.beginPath();
        context.setStroke(color);
        context.setLineWidth(5);
        moveTo(0, 0);
        for(double x = 0; x <= getWidth(); x++) {
            double sample = (x / getWidth()) * sampleRate * RANGE;
            double value = wave.sample(discrete ? (int)sample : sample, sampleRate);
            double y =  value * (0.75 * getHeight() / 2);
            lineTo(x, y);
        }
        context.stroke();
    }

    private void moveTo(double x, double y) {
        Point2D screenCoordinates = map(x, y);
        context.moveTo(screenCoordinates.getX(), screenCoordinates.getY());
    }

    private void lineTo(double x, double y) {
        Point2D screenCoordinates = map(x, y);
        context.lineTo(screenCoordinates.getX(), screenCoordinates.getY());
    }

    private void fillText(double x, double y, String text) {
        Point2D screenCoordinates = map(x, y);
        context.fillText(text, screenCoordinates.getX(), screenCoordinates.getY());
    }

    private void strokeLine(double x1, double y1, double x2, double y2) {
        Point2D from = map(x1, y1);
        Point2D to = map(x2, y2);
        context.strokeLine(from.getX(), from.getY(), to.getX(), to.getY());
    }

    /**
     * Maps a point from real space to screen space
     * @param x x coordinate in real space
     * @param y y coordinate in real space
     * @return Point x and y mapped to screen coordinates.
     */
    private Point2D map(double x, double y) {
        return new Point2D(x, getHeight() / 2 - y);
    }

    private void clearScreen() {
        context.setFill(BACKGROUND_COLOR);
        context.fillRect(0, 0, getWidth(), getHeight());
    }

    private void drawAxes() {
        context.setStroke(AXES_COLOR);
        context.setFill(AXES_COLOR);

        //        context.strokeLine(0, halfHeight, getWidth(), halfHeight);
        strokeLine(0, 0, getWidth(), 0);

        int tickCount = 10;
        double div = getWidth() / tickCount;
        int tickSize = 10;
        for(double x = 0; x <= getWidth(); x += div) {
            context.beginPath();
            moveTo(x, -tickSize / 2);
            lineTo(x, tickSize / 2);
            context.stroke();
            drawAxisLabel(tickSize, x);
        }

        double max = (getHeight() / 2) * 0.75;
        strokeLine(0, max, getWidth(), max);
        strokeLine(0, -max, getWidth(), -max);

    }

    private void drawAxisLabel(int tickSize, double x) {
        context.setTextAlign(TextAlignment.CENTER);
        context.setTextBaseline(VPos.TOP);
        double time = (x / getWidth()) * RANGE;
        fillText(x, -tickSize / 2, generateLabelText(time));
    }

    private String generateLabelText(double time) {
        String unit;
        if(time <= 1) {
            time *= 1000;
            unit = "ms";
        } else {
            unit = "s";
        }
        return String.format("%.1f%s", time, unit);
    }


    public void setWave(CompositeWave wave) {
        this.wave = wave;
        draw();
    }

    public CompositeWave getWave() {
        return this.wave;
    }

    public boolean isDiscrete() {
        return discrete;
    }

    public void setDiscrete(boolean discrete) {
        this.discrete = discrete;
        draw();
    }

    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }


}
