package me.miguel.test2.testB;

public class Naloga1 {

    public static void main(String[] args) {

        int st = 20;

        // izpise samo liha stevila v intervalu od 20 do 10
        while (st != 10) {
            System.out.print(st % 2 != 0 ? st + "\n" : "");
            st--;
        }
    }
}
