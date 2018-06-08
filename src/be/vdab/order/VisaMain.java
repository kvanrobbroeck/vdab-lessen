package be.vdab.order;

import be.vdab.order.VisaBetaling;

public class VisaMain {
    public static void main(String[] args) {
        VisaBetaling b = new VisaBetaling(9.95, 5);
        System.out.println(b.totaalPrijs());
    }
}
