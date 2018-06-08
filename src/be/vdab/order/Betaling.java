package be.vdab.order;

public class Betaling {
    double price;
    int quantity;

    protected double tussenberekening() {
        double totaal = price * quantity;
        if(quantity > 10) {
            totaal *= 0.9;
        }
        return totaal;
    }
}
