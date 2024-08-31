package com.kauassilva.project;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type an integer, and check if it is present in the Fibonacci sequence: ");
        int number = scanner.nextInt();

        if (contains(number)) {
            System.out.println("The number " + number + " is present in the Fibonacci sequence");
        } else {
            System.out.println("The number " + number + " is not present in the Fibonacci sequence");
        }

        scanner.close();
    }

    /**
     * Checks if a given number is present in the Fibonacci sequence.
     *
     * @param number The number to be checked.
     * @return {@code true} if the number is present in the Fibonacci sequence, {@code false} otherwise.
     */
    public static boolean contains(int number) {
        int value1 = 0;
        int value2 = 1;

        while (value1 <= number) {
            if (value1 == number || value2 == number) {
                return true;
            }

            int nextValue = value1 + value2;
            value1 = value2;
            value2 = nextValue;
        }

        return false;
    }

}