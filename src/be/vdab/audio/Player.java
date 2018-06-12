package be.vdab.audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Player implements AutoCloseable {
    private final SourceDataLine line;
    private AudioFormat format;

    /**
     * Creates a player with sample rate of 16KiBHz
     */
    public Player() {
        this(16*1024);
    }

    public Player(int sampleRate) {
        format = new AudioFormat(sampleRate, 8, 1, true, true);
        try {
            line = AudioSystem.getSourceDataLine(format);
            line.open(format, sampleRate);      // 1 second buffer i think?
            line.start();
        } catch (LineUnavailableException e) {
            throw new RuntimeException("Unable to obtain data line", e);
        }
    }

    public int getSampleRate() {
        return (int) format.getSampleRate();
    }

    @Override
    public void close() throws Exception {
        line.close();
    }

    /**
     * Not very efficient memory use.
     */
    public void play(CompositeWave wave, double duration) {
        byte[] data = new byte[(int) (getSampleRate() * duration)];
        for (int sample = 0; sample < data.length; sample++) {
            double value = wave.sample(sample, getSampleRate());
            data[sample] = (byte) (value * 127);
        }
        line.write(data, 0, data.length);
//        line.drain();
    }
}
