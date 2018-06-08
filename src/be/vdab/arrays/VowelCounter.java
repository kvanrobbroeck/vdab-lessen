package be.vdab.arrays;

import java.util.Scanner;

/**
 * Voorbeeld van een heel dynamische versie van VowelCounter, maar wel nog met
 * beperkingen (werkt enkel met letters, geen spaties, leestekens, ...); anders BOOM!
 */
public class VowelCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().toLowerCase();

        char[] data = converteerNaarArray(input);
        int[] letters = telLetters(data);

        System.out.println("A: " + letters[letterAlsIndex('a')]);
        System.out.println("E: " + letters[letterAlsIndex('e')]);
        System.out.println("I: " + letters[letterAlsIndex('i')]);
        System.out.println("O: " + letters[letterAlsIndex('o')]);
        System.out.println("U: " + letters[letterAlsIndex('u')]);

    }

    public static int[] telLetters(char[] data) {
        int[] letters = new int[26];
        for (char datum : data) {
            letters[letterAlsIndex(datum)]++;
        }
        return letters;
    }

    public static int letterAlsIndex(char ch) {
        return ch - 'a';
    }

    public static char[] converteerNaarArray(String in) {
        char[] out = new char[in.length()];

        for(int i = 0; i < in.length(); i++) {
            out[i] = in.charAt(i);
        }

        return out;
    }
}
