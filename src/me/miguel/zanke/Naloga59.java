package me.miguel.zanke;

import java.util.Scanner;

public class Naloga59 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("input a number: ");
        number = scanner.nextInt();

        System.out.printf("Minimum Cipher of number: %d, equals: %d%n",
                number, minCipher(number));
        System.out.printf("Maximum Cipher of number: %d, equals: %d%n",
                number, maxCipher(number));
        System.out.printf("The average of all the ciphers in number: %d, " +
                "equals: %.2f%n", number, average(number));
    }

    public static int minCipher(int num) {
        int currentCipher;
        int minimumCipher = 9;
        while (num > 0) {

            currentCipher = num % 10;
            minimumCipher = Math.min(minimumCipher, currentCipher);
            num /= 10;
        }

        return minimumCipher;
    }
    
    public static int maxCipher(int num) {
        int currentCipher;
        int maximumCipher = 0;
        while (num > 0) {

            currentCipher = num % 10;
            maximumCipher = Math.max(maximumCipher, currentCipher);
            num /= 10;
        }

        return maximumCipher;
    }

    public static double average(int num) {
        int currentCipher;
        int count = 0;
        int total = 0;
        while (num > 0) {

            currentCipher = num % 10;
            total += currentCipher;
            count++;
            num /= 10;
        }

        return (double) total / count;
    }
}
