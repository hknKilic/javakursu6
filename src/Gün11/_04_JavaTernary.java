package Gün11;

import java.util.Scanner;

public class _04_JavaTernary {

    public static void main(String[] args) {

        ///Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini
        // ekrana yazdırınız. Ternary operatör ile yapınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz=");
        int sayı= oku.nextInt();

        //1.yol
        int sonuc=(sayı>50)?1:0;
        System.out.println("sonuc="+sonuc);

        //2.yol
        System.out.println((sayı>50)?1:0);
            if (sayı>50)
                System.out.println(1);
            else
                System.out.println(0);



    }
}
