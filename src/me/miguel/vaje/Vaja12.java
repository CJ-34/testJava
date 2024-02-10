package me.miguel.vaje;
import java.util.Scanner;
public class Vaja12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();

        if (st < 0) {
            st *= -1;
        }

        // Math.abs(st);

        System.out.println("Absolutna vrednost: " + st);

    }
}
