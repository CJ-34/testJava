package me.miguel.vaje;

import java.util.Scanner;

public class Vaja20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        double odstotek = sc.nextDouble();

        System.out.println(odstotek + "% od " + st + " je " + (st * (odstotek / 100)));




    }
}
