package be.vdab.transport;

public class Bicycle extends Transport implements Washable {
    public Bicycle(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void move() {
        System.out.println("Trap ze!");
    }

    @Override
    public void wash() {
        System.out.println("Washing bicycle");
    }
}
