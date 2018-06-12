package be.vdab.transport;

public class Airplane extends Transport implements Refuelable, Washable {
    private String wingStatus;

    public Airplane(String name, String brand, String wingStatus) {
        super(name, brand);
        this.wingStatus = wingStatus;
    }

    @Override
    public void move() {
        System.out.println("Flying around");
    }

    public String getWingStatus() {
        return wingStatus;
    }

    public void setWingStatus(String wingStatus) {
        this.wingStatus = wingStatus;
    }

    @Override
    public boolean refuel(int amount) {
        System.out.println("Fuel left wing");
        System.out.println("Fuel right wing if present");
        return true;
    }

    public void fly() {
        System.out.println("Zoef!");
    }

    @Override
    public void wash() {
        System.out.println("Washing plane");
    }
}
