package me.miguel.vaje;

public class Vaja8 {

    public static void main(String[] args) {

        int st = 72;
        int enice;
        int desetice;

        enice = st % 10;
        desetice = (st % 100) / 10;

        System.out.println((enice * 10) + desetice);


    }
}
