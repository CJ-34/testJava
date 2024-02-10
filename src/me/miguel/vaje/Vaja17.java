package me.miguel.vaje;

import java.util.Scanner;

public class Vaja17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cevelj = sc.nextDouble();
        double palec = cevelj * 12;
        double cm = palec * 2.54;

        System.out.println(cevelj + " cevljev je enako " + palec + " palcev in " + cm + " centimov");

    }
}
