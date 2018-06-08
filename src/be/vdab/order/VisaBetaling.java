package be.vdab.order;

public class VisaBetaling extends Betaling {
    public double totaalPrijs() {
        return tussenberekening() * 1.02;
    }
}
