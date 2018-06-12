package be.vdab.transport;

import java.util.Scanner;

public class TransportCreator {
    public static Transport createTransport() {
        Scanner s = new Scanner(System.in);
        System.out.print("Welk transportmiddel: ");
        String transportMiddel = s.next();
        Transport t = null;
        if(transportMiddel.equals("car")) {
            // TODO: clean this up!
            System.out.print("Geef naam: ");
            String name = s.next();
            System.out.print("Geef brand: ");
            String brand = s.next();
           t = new Car(name, brand);

        } else if(transportMiddel.equals("plane")) {
            System.out.print("Geef naam: ");
            String name = s.next();
            System.out.print("Geef brand: ");
            String brand = s.next();
            System.out.print("Geef wingstatus: ");
            String wingStatus = s.next();
            t= new Airplane(name, brand, wingStatus);
        }
        return t;
    }
}
