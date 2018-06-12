package be.vdab.transport;

public abstract class Transport {
    private String name;
    private String brand;

    public Transport(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
