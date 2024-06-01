package me.miguel.zanke;

import java.util.Scanner;

public class NalgoaMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int trenutna;
        int max = 0;

        while (st > 0) {
            trenutna = st % 10;
            if (trenutna > max) {
                max = trenutna;
            }
            st /= 10;
        }
        System.out.println("Najvecja stevka je " + max);
        

    }
    
}
