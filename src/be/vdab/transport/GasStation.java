package be.vdab.transport;

public class GasStation {
    public void service(Refuelable r) {
        System.out.println("Accepting to gas station " + r);
        while(!r.refuel(1)) {
            System.out.println("Continue to add fuel...");
        }
    }
}
