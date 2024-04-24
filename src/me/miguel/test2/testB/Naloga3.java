package me.miguel.test2.testB;

import java.util.Scanner;

public class Naloga3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesi stevilo: ");
        int st = scanner.nextInt();
        int current;
        int min = 9;

        while (st > 0) {

            System.out.println("--> " + st);
            current = st % 10;
            System.out.println("Trenutna stevka: " + current);
            min = current < min ? current : min;
            st /= 10;
        }

        System.out.println("Najmanjsa stevka je: " + min);
    }
}
