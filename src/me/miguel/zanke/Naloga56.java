package me.miguel.zanke;

public class Naloga56 {

    public static void main(String[] args) {
        for (double x = 0; x <= 9; x += 0.5) {
            double y = Math.max(0, Math.pow(x, 2) - 9); // Funkcija Y = (X)^2 - 9
            int spaces = (int) y; // Izracun zamika
            for (int i = 0; i < spaces; i++) {
                System.out.print(" "); // Izpis praznih znakov
            }
            System.out.println("*"); // Izpis zvezdice za vrednost funkcije
        }
    }
}

