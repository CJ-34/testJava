package me.miguel.vaje;

import java.util.Scanner;

public class Vaja15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int st1 = sc.nextInt();
        int st2 = sc.nextInt();
        int st3 = sc.nextInt();
        int najvecje;

        najvecje = Math.max(st1, Math.max(st2, st3));

        System.out.println("Najvecj estevilo med " + st1 + ", " + st2 +
                " in " + st3 +" je " + najvecje);
    }
}
