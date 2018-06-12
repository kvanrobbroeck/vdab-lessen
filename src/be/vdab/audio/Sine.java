package be.vdab.audio;

public class Sine {
    private double frequency;
    private double amplitude;

    public Sine(double frequency) {
        this(frequency, 1);
    }

    public Sine(double frequency, double amplitude) {
        this.frequency = frequency;
        this.amplitude = amplitude;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }


    public double sample(double sample, int sampleRate) {
        return Math.sin(frequency * sample * 2 * Math.PI / sampleRate) * amplitude;
    }
}
