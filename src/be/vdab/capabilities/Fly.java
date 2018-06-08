package be.vdab.capabilities;

class Fly implements Capability {
    @Override
    public void act() {
        System.out.println("Flap flap");
    }
}
