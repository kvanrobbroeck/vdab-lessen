package be.vdab.transport;

public class SquareWheel extends Wheel {
    public SquareWheel(int size, int bar) {
        super(size, bar);
    }

    @Override
    public void turn() {
        System.out.println("Boink blok boem clap");
    }

    public int angles() {
        return 4;
    }
}
