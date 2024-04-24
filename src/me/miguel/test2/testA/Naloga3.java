package me.miguel.test2.testA;

import java.util.Scanner;

public class Naloga3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // razstavi stevilke na posamezne stevke in sesteje

        System.out.print("Vnesi stevilo: ");
        int st = scanner.nextInt();
        int total = 0;
        int current;

        while (st > 0) {

            System.out.println("--> " + st);
            current = st % 10;
            System.out.println("Trenutna Stevka: " + current);
            total += current;
            st /= 10;

        }

        System.out.println("Vsota vseh stevk: " + total);

    }
}
