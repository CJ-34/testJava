package me.miguel.zanke;

import java.util.Scanner;

public class Naloga57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, distance;

        do {

            System.out.print("x coordinate: ");
            x = scanner.nextInt();
            System.out.print("y coordinate: ");
            y = scanner.nextInt();

            distance = Math.sqrt(x * x + y * y);
            System.out.printf("distance between x = %.2f and y = %.2f equals: %.2f%n", x, y, distance);

        } while (x != 0 || y != 0);

        scanner.close();
    }
}
