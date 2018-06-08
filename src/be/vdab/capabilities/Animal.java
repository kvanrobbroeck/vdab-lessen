package be.vdab.capabilities;

public class Animal {
    private String name;
    private int capabilityIndex = 0;
    private Capability[] capabilities = new Capability[3];

    public Animal(String name) {
        this.name = name;
    }

    public void add(Capability c) {
        if(capabilityIndex < capabilities.length) {
            capabilities[capabilityIndex++] = c;
        }

    }

    public void move() {
        int randomIndex = (int)(Math.random() * capabilityIndex);
        capabilities[randomIndex].act();
    }
}

