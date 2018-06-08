package be.vdab.beehive;

public class Worker extends Bee {
    private int capacity;
    private int load;

    public Worker() {
        this("John Doe", 0, 100);
    }

    public Worker(int load) {
        this("John Doe", load, 100);
    }

    public Worker(String name, int load, int capacity) {
        super(name);
        System.out.println("Create new worker");
        this.capacity = capacity;
        this.load = load;
    }

    /**
     * @return true if capacity remaining, false if full.
     */
    public boolean gatherNectar(Flower f) {
        load += f.nectar;

        System.out.println("Worker "
                + getName() + " visits flower "
                + f.name + " to gather "
                + f.nectar
                + " amount of nectar so that she is now loaded "
                + this.load + "/" + this.capacity
        );
        f.nectar = 0;
        return load >= capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLoad() {
        return load;
    }

    @Override
    public void fly() {
        if(((double)load) / capacity > 0.9) {
            System.out.println("ignite afterburners for extra boosting power");
        }
        super.fly();
    }

    @Override
    public void contribute(int input) {
        System.out.println("CONTRUBTE FROM WORKER");
    }
}
