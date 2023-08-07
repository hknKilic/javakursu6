package Gün14;

import java.util.Scanner;

public class _02_DoWhile2 {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        String girilen;

        do {
            System.out.println("ifade giriniz=");
            girilen = oku.next();

            if (girilen.equalsIgnoreCase("x"))
                System.out.println("program calısıyor");


        } while (!girilen.equalsIgnoreCase("x"));
        System.out.println("program bitti");


    }

}
