package be.vdab.beehive;

public class Larva {
    int size; // development

    public boolean isFullyGrown() {
        return size >= 10;
    }

    public Worker hatch() {
        return new Worker();
    }
}
