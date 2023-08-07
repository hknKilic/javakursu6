package Gün10;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("sifreniz=");
        String sifre= oku.nextLine();

        System.out.println("sifreniz tekrar=");
        String sifreTekrar= oku.nextLine();

        if (sifre==sifreTekrar)
            System.out.println("AYNI");//BURADA ODANIN İCİNİ GÖREN İSLEM YAPMAZ.
        //Olması greken String ifadelerde bu işlem için icreik karsılastırıcı Equals kullanılmalı.

        //en dogrusu:

        if (sifre.equals(sifreTekrar)==true) //Stringlerde her zaman hafızadaki yerlerinin kontrol eder.
            System.out.println("AYNI");

        if (sifre.equals(sifreTekrar)==false)
            System.out.println("DEGİL");


    }
}
