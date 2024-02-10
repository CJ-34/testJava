package me.miguel.vaje;

import java.util.Scanner;

public class Vaja16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yardi = sc.nextInt();

        double m = yardi * 0.9144;
        double dm = yardi * 0.9144 * 10;
        double cm = m * 100;

        System.out.println(m + " " + dm + " " + cm);

    }
}
