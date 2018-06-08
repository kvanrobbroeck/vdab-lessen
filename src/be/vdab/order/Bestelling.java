package be.vdab.order;

public class Bestelling {
    double price;
    int quantity;

    public Bestelling() {
        this.price = 10;
        this.quantity = 1;
    }

    public Bestelling(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Plaatst een bestelling met opgegeven prijs, en aantal gelijk aan 1.
     * @param price De gewenste product prijs.
     */
    public Bestelling(double price) {
        this(price, 1);
    }

    public double berekenTotaalBedragInclBtw() {
        return berekenTotaalExclBtw() * 1.21;
    }

    public double berekenTotaalExclBtw() {
        return this.price * this.quantity;
    }
}
