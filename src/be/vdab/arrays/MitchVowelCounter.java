package be.vdab.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MitchVowelCounter {

    public static void main(String[] args) {
        System.out.println("Voer een text in AUB: ");

        Scanner scText = new Scanner(System.in);

        String givenText = scText.nextLine().toLowerCase();

        char[] textArray = new char[givenText.length()];
        char[] vowelArray = {'a', 'u', 'o', 'i', 'e'};
        int[] vowelCount = new int[vowelArray.length];

        for (int i = 0; i < givenText.length(); i++) {
            textArray[i] = givenText.charAt(i);
            System.out.println("LETTER " + textArray[i]);
            for (int j = 0; j < vowelArray.length; j++) {
                if (textArray[i] == vowelArray[j]) {
                    System.out.println("HIT");
                    vowelCount[j]++;
                }
            }
        }

        System.out.println("het aantal keer A bedraagt: " + vowelCount[0]);

        System.out.println("het aantal keer U bedraagt: " + vowelCount[1]);

        System.out.println("het aantal keer O bedraagt: " + vowelCount[2]);

        System.out.println("het aantal keer I bedraagt: " + vowelCount[3]);

        System.out.println("het aantal keer E bedraagt: " + vowelCount[4]);
    }
}