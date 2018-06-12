package be.vdab.transport;

public class Car extends Transport implements Refuelable, Washable {
    private Wheel[] wheels = new Wheel[4];

    public Car(String name, String brand) {
        super(name, brand);
        wheels[0] = new Wheel(16, 2);
        wheels[1] = new Wheel(16, 2);
        wheels[2] = new Wheel(16, 2);
        wheels[3] = new SquareWheel(16, 2);
    }

    @Override
    public void move() {
        for (Wheel wheel : wheels) {
            wheel.turn();
            if(wheel instanceof SquareWheel) {
                System.out.println("Wheel has " + ((SquareWheel)wheel).angles() + " angles");
            }
        }
        System.out.println("Driving car...");
    }

    @Override
    public boolean refuel(int amount) {
        System.out.println("Car refuel full");
        return true;
    }

    @Override
    public void wash() {
        System.out.println("Washing car");
    }

    public Wheel getWheel(int i) {
        return wheels[i]; // TODO: DANGER
    }
}
