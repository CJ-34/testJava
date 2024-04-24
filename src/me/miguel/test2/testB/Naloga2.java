package me.miguel.test2.testB;

public class Naloga2 {

    public static void main(String[] args) {

        int count = 1;
        int potenca = 1;
        // prvih 10 potenc stevila 2
        do {

            potenca *= 2;
            System.out.println(potenca);
            count++;

        } while (count <= 10);

    }
}
