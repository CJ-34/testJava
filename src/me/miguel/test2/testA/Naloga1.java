package me.miguel.test2.testA;

public class Naloga1 {

    public static void main(String[] args) {
        int i = 1;

        // izpise stevila od 1 do 12, ko pa je stevilo enako 11 izpise November namesto stevila
        do {
            System.out.println(i == 11 ? "November" : i);
            i++;
        } while (i <= 12);
    }
}
