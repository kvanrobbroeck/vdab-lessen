package be.vdab.audio;

class Note {
    public static final Sine C3 = new Sine(130.81);
    public static final Sine D3 = new Sine(146.83);
    public static final Sine Eb3 = new Sine(155.56);
    public static final Sine E3 = new Sine(164.81);
    public static final Sine F3 = new Sine(174.61);
    public static final Sine Fs3 = new Sine(185.00);
    public static final Sine Gb3 = Fs3;
    public static final Sine G3 = new Sine(196.00);
    public static final Sine A3 = new Sine(220);
    public static final Sine Bb3 = new Sine(233.08);
    public static final Sine B3 = new Sine(246.94);
    public static final Sine C4 = new Sine(261.63);
    public static final Sine D4 = new Sine(293.66);
    public static final Sine Eb4 = new Sine(311.13);
    public static final Sine E4 = new Sine(329.63);
    public static final Sine F4 = new Sine(349.23);
    public static final Sine Fs4 = new Sine(369.99);
    public static final Sine Gb4 = Fs4;
    public static final Sine G4 = new Sine(392.00);
    public static final Sine A4 = new Sine(440.00);
    public static final Sine Bb4 = new Sine(466.16);
    public static final Sine B4 = new Sine(493.88);
    public static final Sine C5 = new Sine(523.25);
    public static final Sine D5 = new Sine(587.33);
    public static final Sine E5 = new Sine(659.26);
    public static final Sine REST = new Sine(0.00);



    private CompositeWave tone;
    private int length;

    public Note(Sine tone, int length) {
        this.tone = new CompositeWave(tone);
        this.length = length;
    }

    public CompositeWave getTone() {
        return tone;
    }

    public void setTone(CompositeWave tone) {
        this.tone = tone;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
