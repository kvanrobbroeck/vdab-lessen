package be.vdab.transport;

public class Generator implements Refuelable {
    private int power;

    public void generateElectricity() {
        System.out.println("Genering electricity of " + power + "Watt");
    }

    @Override
    public boolean refuel(int amount) {
        System.out.println("Fuel generator");
        return true;
    }
}
