package me.miguel.vaje;

import java.util.Scanner;

public class Vaja18 {

    final static double PI = Math.PI;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vnesi polmer kroga: ");
        double r = scanner.nextDouble();
        System.out.print("vnesi dolzino stranice a in b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double plosK = PI * (r*r);
        double obsK = 2 * PI * r;

        double plosP = a * b;
        double obsP = 2 * (a + b);

        System.out.printf("ploscina kroga: %.2f%n", plosK);
        System.out.printf("obseg kroga: %.2f%n", obsK);
        System.out.printf("ploscina pravokotnika: %.2f%n", plosP);
        System.out.printf("obseg pravokotnika: %.2f%n", obsP);


    }
}
