package be.vdab.order;

public class VisaBetaling extends Betaling {
    public VisaBetaling(double price, int quantity) {
        super(price, quantity);
    }

    public double totaalPrijs() {
        return tussenberekening() * 1.02;
    }
}
