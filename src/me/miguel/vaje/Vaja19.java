package me.miguel.vaje;

import java.util.Scanner;

public class Vaja19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int leto = sc.nextInt();

        String rezultat = (leto % 4 == 0) ? (leto % 100 == 0) ? (leto % 400 == 0) ? "true" : "false" : "true" : "false";
        System.out.println(rezultat);
    }
}
