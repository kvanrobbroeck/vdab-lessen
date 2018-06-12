package be.vdab.bakery;

//import static be.vdab.bakker.BreadSize.*;
import java.util.Scanner;

public class Bakker {
    public static void main(String[] args) {
        System.out.println("Geef een soort brood: ");
        Scanner s = new Scanner(System.in);
        BreadSize b = BreadSize.valueOf(s.next());
        System.out.println("Dit soort brood weegt " + b.getWeight() + " gram.");

        BreadSize[] sizes = BreadSize.values();
        for (BreadSize size : sizes) {
            System.out.println(size.name() + " kost " + size.berekenPrijs() + "€");
        }

        Bread x = bakeBread(b);


    }

    /**
     * @param size either SMALL, MEDIUM or LARGE
     */
    public static Bread bakeBread(BreadSize size) {
        size.berekenPrijs();
        // ...
        // ..
        return new Bread();
    }
}
