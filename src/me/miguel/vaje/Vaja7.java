package me.miguel.vaje;

public class Vaja7 {

    public static void main(String[] args) {

        int a = 56;
        int b = 7;
        int c;
        System.out.println("Pred zamenjavo");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = b;
        b = a;
        a = c;

        System.out.println("Po zamenjavi");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
