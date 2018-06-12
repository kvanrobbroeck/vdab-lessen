package be.vdab.bakery;

public enum BreadSize {
    SMALL("B", 400),
    MEDIUM("Z", 500),
    LARGE("Y", 600),
    JUMBO("X", 700);

    private String label;
    private int weight;

    BreadSize(String label, int weight) {
        this.label = label;
        this.weight = weight;
    }

    public String getLabel() {
        return label;
    }

    public int getWeight() {
        return weight;
    }

    public double berekenPrijs() {
        return 2 * ((double)weight / MEDIUM.weight);
    }
}

