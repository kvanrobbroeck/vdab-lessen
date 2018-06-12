package be.vdab.audio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeWave {
    private List<Sine> sines = new ArrayList<>();

    public CompositeWave(Sine... sines) {
        this.sines.addAll(Arrays.asList(sines));
    }

    public void add(Sine sine) {
        sines.add(sine);
    }

    /**
     * Superimposes all sine waves to create more interesting wave.
     */
    public double sample(double sample, int sampleRate) {
        double sum = 0;
        for (Sine sine : sines) {
            sum += sine.sample(sample, sampleRate);
        }
        return sum;
    }
}
