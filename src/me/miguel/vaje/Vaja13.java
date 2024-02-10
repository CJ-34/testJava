package me.miguel.vaje;

import java.util.Scanner;

public class Vaja13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();

        if (st % 5 == 0 && st % 6 != 0) {
            System.out.println("Stevilo je deljivo s 5 in ne z 6");
        } else {
            System.out.println("stevilo " + st +" ne ustreza kriterjam");

        }
    }
}
