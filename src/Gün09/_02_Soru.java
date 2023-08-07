package Gün09;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("sayı giriniz=");

        int sayı = oku.nextInt();

        if (sayı > 0)
            System.out.println("pozitif=");
        if (sayı < 0)
            System.out.println("negatif=");
        if (sayı == 0)
            System.out.println("sıfır=");


    }
}
