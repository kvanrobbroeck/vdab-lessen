package be.vdab.order;

import be.vdab.beehive.Flower;

public class DemoWorker {
    String name;
    private int capacity;
    int load;

    public DemoWorker() {
        this("John Doe", 0, 100);
    }

    public DemoWorker(int load) {
        this("John Doe", load, 100);
    }

    public DemoWorker(String name, int load, int capacity) {
        System.out.println("Create new worker");
        this.name = name;
        this.capacity = capacity;
        this.load = load;
    }

    public void fly() {
        System.out.println("Bzzzz");
    }

    /**
     * @return true if capacity remaining, false if full.
     */
    public boolean gatherNectar(DemoFlower f) {
        load += f.nectar;

        System.out.println("Worker "
                + this.name.toUpperCase() + " visits flower "
                + f.name + " to gather "
                + f.nectar
                + " amount of nectar so that she is now loaded "
                + this.load + "/" + this.capacity
        );
        f.nectar = 0;
        return load >= capacity;
    }
}
