package be.vdab.order;

import be.vdab.beehive.Worker;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String re = s.next();
        Address bestemming = new Address(
            re,
            "A. Vaucampslaan",
            "42/301",
            "Huizingen",
            "1685"
        );


//        System.out.println(bestemming.getCity());
//        bestemming.setCity("Schelle");
//        bestemming.city = "Schelle";
//
//        bestemming.city =

        //bestemming.print();
    }
}
