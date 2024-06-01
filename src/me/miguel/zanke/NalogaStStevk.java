package me.miguel.zanke;
import java.util.Scanner;

public class NalogaStStevk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int c = 0;

        while (st > 0) {
            st /= 10;
            c++;
        }

        System.out.println(c);
    }   
    
}
