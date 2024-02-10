package me.miguel.vaje;

import java.util.Scanner;
public class Vaja11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ime;
        String priimek;
        int starost;

        System.out.print("Vnesi ime, priimek in starost: ");
        ime = scanner.next();
        priimek = scanner.next();
        starost = scanner.nextInt();

        System.out.println("Sem " + ime + " " + priimek + " star sem " + starost + " let");



    }
}
