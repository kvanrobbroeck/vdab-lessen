package be.vdab.beehive;

public abstract class Bee implements Insect {


    protected String name;
    private int age;

    public Bee(String name) {
        System.out.println("CONSTRUCTOR MET NAAM " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("Bee " + name + " is flying around: Bzzzz!");
    }

    @Override
    public String toString() {
        return "Bee: " + name;
    }

    public abstract void contribute(int input);

    @Override
    public void eat() {
        System.out.println("EAT");
    }

    @Override
    public void crawl() {
        System.out.println("CRAWL");
    }

    @Override
    public void poo() {
        System.out.println("POO");
    }
}
