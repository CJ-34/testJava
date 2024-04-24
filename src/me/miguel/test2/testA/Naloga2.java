package me.miguel.test2.testA;

public class Naloga2 {

    public static void main(String[] args) {
        int potenca = 1;
        // koda izpise prvih 10 potenc stevila 3
        for (int i = 1; i <= 10; i++) {
            potenca *= 3;
            System.out.println(potenca);
        }
    }
}
