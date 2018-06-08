package be.vdab.order;

public class ErpApplicatie {
    public static void main(String[] args) {
        Bestelling b1 = new Bestelling(10.95, 5);
        double totaal = b1.berekenTotaalBedragInclBtw();
        b1.berekenTotaalExclBtw();
        System.out.println(totaal);

        Bestelling b2 = new Bestelling(75.99);
        System.out.println(b2.berekenTotaalBedragInclBtw());
    }
}
