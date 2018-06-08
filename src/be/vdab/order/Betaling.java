package be.vdab.order;

public class Betaling {
    double price;
    int quantity;

    public Betaling(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    protected double tussenberekening() {
        double totaal = price * quantity;
        if(quantity > 10) {
            totaal *= 0.9;
        }
        return totaal;
    }
}
