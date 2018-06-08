package be.vdab.beehive;

public class Nurse extends Bee {
    int energy;
    int patience;

    public Nurse(String name) {
        super(name);
    }

    public Worker nurseLarva(Larva larfje) {
        this.energy--;
        this.patience -= 10;
        larfje.size += 2;
        System.out.println("Nurse " + name + " nurses larva which grows to size " + larfje.size);
        if(larfje.isFullyGrown()) {
            return larfje.hatch();
        } else {
            return null;
        }
    }

    @Override
    public void fly() {
        System.out.println("Fly like a nurse");
    }

    @Override
    public void contribute(int input) {
        System.out.println("NURSE CONTRIBUTE");
    }
}
