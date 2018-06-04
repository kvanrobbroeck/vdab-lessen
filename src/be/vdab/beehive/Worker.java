package be.vdab.beehive;

public class Worker {
    String name;
    int capacity;
    int load;

    public Worker() {
        this("John Doe", 0, 100);
    }

    public Worker(int load) {
        this("John Doe", load, 100);
    }

    public Worker(String name, int load, int capacity) {
        System.out.println("Create new worker");
        this.name = name;
        this.capacity = capacity;
        this.load = load;
    }

    /**
     * @return true if capacity remaining, false if full.
     */
    public boolean gatherNectar(Flower f) {
        load += f.nectar;

        System.out.println("Worker "
                + this.name + " visits flower "
                + f.name + " to gather "
                + f.nectar
                + " amount of nectar so that she is now loaded "
                + this.load + "/" + this.capacity
        );
        f.nectar = 0;
        return load >= capacity;
    }
}
