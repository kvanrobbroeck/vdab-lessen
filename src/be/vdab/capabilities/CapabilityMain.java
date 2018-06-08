package be.vdab.capabilities;

public class CapabilityMain {
    public static void main(String[] args) {
        Animal a = new Animal("Bagheera");
        a.add(new Swim());
        a.add(new Walk());
        for(int i=0; i<3; i++) {
            a.move();
        }
    }
}
