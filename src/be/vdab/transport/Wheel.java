package be.vdab.transport;

public class Wheel {
    private int size;
    private int bar; // pressure

    public Wheel(int size, int bar) {
        this.size = size;
        this.bar = bar;
    }

    public void turn() {
        System.out.println("TURINING WHEEL");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }
}
