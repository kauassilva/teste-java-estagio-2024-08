package com.kauassilva.project;

import java.util.Scanner;

public class OccurrencesOfA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a text, and check the number of occurrences of the letter 'a'/'A': ");
        String text = scanner.nextLine();

        int occurrences = calculateOccurrences(text);
        System.out.println("The letter 'a'/'A' appears " + occurrences + " times in the text.");

        scanner.close();
    }

    /**
     * Calculates the occurrences of the letter 'a' or 'A' in a given text.
     *
     * @param text The text in which to count the occurrences of 'a' or 'A'.
     * @return The number of occurrences of 'a' or 'A' in the given text.
     */
    public static int calculateOccurrences(String text) {
        int number = 0;

        for (char character : text.toCharArray()) {
            if (character == 'a' || character == 'A') {
                number++;
            }
        }

        return number;
    }

}