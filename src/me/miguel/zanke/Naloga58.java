package me.miguel.zanke;

import java.util.Scanner;

public class Naloga58 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total = 0, average;

        for (int i = 1; i <= 10; i++) {
            double number = scanner.nextDouble();
            total += number;
        }

        average = total / 10;

        System.out.println("total of inputted numbers: " + total +
                ", average of inputted numbers: " + average);
    }
}
