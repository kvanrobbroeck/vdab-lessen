package be.vdab.arrays;

import java.util.Arrays;

/**
 * Versie van Lotto generator met heel veel fabriekjes in fabriekjes.
 * Dit is een mooi voorbeeld van procedureel programmeren. Als we met objecten werken doen we hetzelfde maar dan via instanties,
 * dus dit is echt de basis van programmatie in (bijna) eender welk (imperatief) paradigma.
 */
public class Lotto {
    /**
     * Startpunt, voert 100 lotto trekkingen uit.
     */
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            int[] trekking = voerTrekkingUit(1, 45);
            printTrekking(trekking);
        }
    }

    /**
     * Voert een lotto trekking uit van 6 unieke getallen en sorteert het resultaat
     */
    public static int[] voerTrekkingUit(int min, int max) {
        int[] trekking = new int[6];
        for(int i = 0; i < trekking.length; i++) {
            int pick = pickUniqueNumber(min, max, trekking);
            trekking[i] = pick;
        }
        Arrays.sort(trekking);
        return trekking;
    }

    /**
     * Trekt een uniek getal (e.g. een getal dat niet reeds in de array aanwezig was.
     */
    public static int pickUniqueNumber(int min, int max, int[] trekking) {
        int candidate = random(min, max);
        while(alreadyPicked(candidate, trekking)) {
            candidate = random(min, max);
        }
        return candidate;
    }

    /**
     * Checkt of een getal reeds aanwezig is in de opgegeven array.
     */
    public static boolean alreadyPicked(int candidate, int[] trekking) {
        for (int reedsAanwezig : trekking) {
            if(candidate == reedsAanwezig) {
                return true;
            }
        }
        return false;
    }

    /**
     * Toont een lotto trekking op het scherm mooi geformatteerd.
     */
    public static void printTrekking(int[] trekking) {
        for (int pick : trekking) {
            System.out.print(pick + "\t");
        }
        System.out.println();
    }

    /**
     * Berekent een peeudo random geheel getal tussen min en max (incl.).
     */
    public static int random(int min, int max) {
        return (int)(min + Math.random() * (max - min + 1));
    }
}
