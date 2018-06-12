package be.vdab.audio;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AudioSineWaveGenerator extends Application {

    private static final int PLAY_DURATION = 1;

    @FXML
    private WaveformPane waveform;

    @FXML
    private TextField frequency;

    @FXML
    Spinner<Integer> amplitude;

    @FXML
    private CheckBox discrete;

    private Player player;

    private ExecutorService executorService;

    public static void main(String[] args) {
        Application.launch(args);
        System.out.println("END");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("application.fxml")));
        primaryStage.setTitle("Audio Sine Wave Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    public void initialize() {
        this.executorService = Executors.newFixedThreadPool(1);
        this.player = new Player();

        waveform.setSampleRate(player.getSampleRate());

        discrete.selectedProperty().addListener((observable, oldValue, newValue) -> {
            waveform.setDiscrete(newValue);
        });

        frequency.setTextFormatter(new TextFormatter<>(new DoubleStringConverter()));
        frequency.setText("440.0");
    }

    public void play(ActionEvent actionEvent) {
        player.play(waveform.getWave(), PLAY_DURATION);
        Task<Void> audioTask = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                System.out.println("Playing sound in background");
                return null;
            }
        };
        executorService.submit(audioTask);
        ((Button)actionEvent.getSource()).disableProperty().bind(audioTask.runningProperty());
    }

    public void addWave(ActionEvent actionEvent) {
        try {
            double f = (Double)frequency.getTextFormatter().getValue();
            double a = amplitude.getValue() / 100.0;
            System.out.println("Adding sine with frequency " + f + " and amplitude " + a);
            waveform.getWave().add(new Sine(f, a));
            waveform.draw();
        } catch (NumberFormatException | NullPointerException e) {  // Forgive me, i'm on a deadline.
            System.out.println("Invalid input. Ignoring");
        }
    }

    public void reset(ActionEvent actionEvent) {
        waveform.setWave(new CompositeWave());
    }
}
