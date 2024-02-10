package me.miguel.vaje;

public class Vaja9a {

    public static void main(String[] args) {

        int st = 1675;

        int enice = st % 10;
        int desetice = st % 100 / 10;
        int stotice = st % 1000 / 100;
        int tisocice = st % 10000 / 1000;

        System.out.printf("%dT %dS %dD %dS", tisocice, stotice, desetice, enice);
    }
}
