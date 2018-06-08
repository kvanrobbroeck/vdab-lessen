package be.vdab.beehive;

public class Queen extends Bee {
    String name;

    public Queen(String name) {
        super(name);
    }

    @Override
    public void contribute(int input) {
        System.out.println("CONTRIBUTUION FROM QUEEN");
    }

    public Larva layLarva() {
        System.out.println("Queen pops out a new larva");
        return new Larva();
    }
}
