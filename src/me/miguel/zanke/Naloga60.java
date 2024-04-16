package me.miguel.zanke;

public class Naloga60 {

    public static void main(String[] args) {

        horizontally(10);
        vertically(10);

        backslash(10);
    }

    public static void horizontally(int length) {

        for (int i = 1; i <= length; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void vertically(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.println("*");
        }
    }

    public static void backslash(int height) {

        for (int i = 1; i <= height; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();

        }
    }
}
