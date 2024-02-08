package me.miguel.vaje;

import java.util.Scanner;
public class Vaja14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int st1 = scanner.nextInt();
        int st2 = scanner.nextInt();

        int max = st1 > st2 ? st1 : st2;
        System.out.println("Najvecje stevilo je: " + max);


    }
}
