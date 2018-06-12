package be.vdab.transport;

public class Truck extends Transport {
    private int capacity;

    public Truck(String name, String brand, int capacity) {
        super(name, brand);
        this.capacity = capacity;
    }

    @Override
    public void move() {
        System.out.println("Black cloud of smoke");
        System.out.println("Driving truck...");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
