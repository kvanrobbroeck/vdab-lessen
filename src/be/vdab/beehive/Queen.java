package be.vdab.beehive;

public class Queen extends Bee {
    private String name;
    private int energy;

    public Queen(String name) {
        super(name);
        this.energy = 100;
    }

    @Override
    public void contribute(int input) {
        System.out.println("CONTRIBUTION FROM QUEEN");
    }

    public Larva layLarva() {
        System.out.println("Queen pops out a new larva");
        energy -= 10;
        return new Larva();
    }
}
